package ChristmasBreak;

public class GroceryList {
    private GroceryItemOrder[] list = new GroceryItemOrder[10];
    private int index = -1;

    public GroceryList() {

    }

    public void add (GroceryItemOrder item){
        if(index < 9) {
            index++;
            list[index] = item;
        }
    }
    public double getTotalCost(){
        double totalCost = 0;
        for(int x = 0; x <= index; x++){
            totalCost += list[index].getPrice();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        String ret = "" ;
        for(int x = 0; x <= index; x++){
            ret += list[x].toString();
        }
        return ret;
    }
}
