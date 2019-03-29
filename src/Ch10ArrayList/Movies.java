package Ch10ArrayList;
import java.util.ArrayList;
public class Movies {
    private ArrayList<DVD> collection = new ArrayList<DVD>();

    @Override
    public String toString() {
        return("My DVD Collection \n\n" +
                "Number of DVDs: " + collection.size() +"\n" +
                "Total Cost: $" + totalCost() +"\n" +
                "Average Cost: $" + averageCost() + "\n\n" +
                "DVD List: " + "\n\n" +
                listToString());
    }
    public void addDVD(DVD newDVD){
       collection.add(newDVD);
    }
    public double totalCost(){
        double total = 0;
        for(int x = 0; x < collection.size(); x++){
            total = total + collection.get(x).getCost();
        }
        double rounder = Math.round(total*1000);
        return rounder/1000;
    }
    public double averageCost(){
        double total = 0;
        for(int x = 0; x < collection.size(); x++){
            total = total + collection.get(x).getCost();
        }
        double rounder = Math.round((total/collection.size())*100);
        return rounder/100;
    }
    public String listToString(){
        String ret = "";
        for(int x = 0; x < collection.size(); x++){
            ret = ret + collection.get(x).toString();
        }
        return ret;
    }
}