package Projects;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Sum {
    public static int limit = 25;
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("sum.txt");
        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            Scanner lineScanner = new Scanner(line);
            String currentString = lineScanner.next();
            int[] num1 = createArray(currentString);
            printArray(num1);
            while(lineScanner.hasNext()){
                currentString = lineScanner.next();
                int[] num2 = createArray(currentString);
                System.out.print(" + ");
                printArray(num2);
                num1 = add(num1, num2);
            }
            System.out.print(" = ");
            printArray(num1);
            System.out.println();
        }
    }
    public static int[] add(int[] num1, int[] num2){
        for(int x = limit-1; x > -1; x--){
            int sum = num1[x] + num2[x];
            num1[x] = sum%10;
            if(sum >= 10){
                num1[x-1] = sum/10;
            }
        }
        return num1;
    }
    public static int[] createArray(String currentString){
        int[] num = new int[limit];
        int midpoint = limit-currentString.length();
        for(int x = 0; x < midpoint; x++){
            num[x] = 0;
        }
        int y = 0;
        for(int x = midpoint; x < limit; x++){
            num[x] = Character.getNumericValue(currentString.charAt(y));
            y++;
        }
        return num;
    }
    public static void printArray(int[] array){
        boolean start = false;
        for(int x = 0; x < array.length; x++){
            if(start == false && array[x] == 0){
            }
            else if(start == false && array[x] != 0) {
                System.out.print(array[x]);
                start = true;
            }
            else{
                System.out.print(array[x]);
            }
        }
        if(start == false){
            System.out.print("0");
        }
    }
}