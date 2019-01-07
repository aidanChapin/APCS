package ChristmasBreak;
import java.util.Scanner;

public class GroceryList {

    private GroceryItemOrder[] list = new GroceryItemOrder[10];
    private int index = 0;

    public GroceryList(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Add at least one item to your list");
        do {
            GroceryItemOrder item = new GroceryItemOrder(scan.next(), scan.nextInt(), scan.nextDouble());
            System.out.println("Wouldy you like to add another (y/n)?");
        }while(scan.next().equals("y"));
    }

    public void add(GroceryItemOrder item){
        list[index] = item;
        index++;
    }

    public double getTotalCost(){
        double totalCost = 0;
        for(int x = 0; x < index+1; x++){
           totalCost += list[x].getCost();
        }
        return totalCost;
    }

}
