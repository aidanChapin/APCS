package Projects;
import java.util.Scanner;
public class RandomHat {
    public static void main(String[] args) {
        output(arrayFiller(userInput()));
    }
    public static int userInput() {//gets the user input on how many teams, checks if its an even number
        System.out.println("How many teams?");
        Scanner scan = new Scanner(System.in);
        int teams = scan.nextInt();//user input
        while (teams%2 != 0 || teams < 2){//checks if even and at least 2
            System.out.println("You must have an even number of teams, and 2 or more teams");
            teams = scan.nextInt();//doesn't move on until teams is more than 1 and even
        }
        return teams;//returns number of teams
    }
    public static String[] arrayFiller(int num) {//fills the array with the teams based on the number of teams
        String[] array = new String[num];
        for (int x = 0; x < num; x++) {//fills the array up to the number of teams
            array[x] = "Team " + (x + 1);//starts at one, moves to numb
        }
        return array;//returns the list of teams
    }
    public static void output(String[] array) {//prints out the team pairings
        int pairings  = array.length/2;//finds ammount of pairs needed
        for(int x = 0; x < pairings; x++){
            array = remover(array);//uses remover to both pick a random team and remove it from the array
            System.out.print(" vs ");
            array = remover(array);//sames as above
            System.out.println();
        }//repeats until every team has a pair
    }
    public static String[] remover(String[] array) {//removes a random index from the array, and prints it out
        int index = (int) (Math.random() * array.length);//picks a random team
        System.out.print(array[index]);//prints out random team
        int y = 0;//index of the new array(only moves on when an index is filled
        String[] newArray = new String[array.length - 1];//new array
        for (int x = 0; x < array.length; x++) {//x follows the old array
            if (x != index) {//as long as its not the random index(the one we want to remove)
                newArray[y] = array[x];//place it into the new array
                y++;//move the new arrays index up
            }
        }
        return newArray;//returns new array, which will replace the old array
    }
}