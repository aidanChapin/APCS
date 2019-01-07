package ChristmasBreak;

public class DVDCollection {
    int size = 1;
    private DVD collection[] = new DVD[size];

    @Override
    public String toString() {
        return("My DVD Collection \n" +
                "Number of DVDs: " + size +"\n" +
                "Total Cost: " + totalCost() +"\n" +
                "Average Cost: " + averageCost() + "\n" +
                "DVD List: " + "\n" +
                listToString());
    }

    public void increaseSize(){
        size++;
    }
    public void addDVD(DVD newDVD){
        collection[0] = newDVD;
    }
    public double totalCost(){
        double total = 0;
        for(int x = 0; x < size+1; x++){
            total += collection[x].getCost();
        }
        return total;
    }
    public double averageCost(){
        return totalCost()/size;
    }
    public String listToString(){
        String ret = "";
        for(int x = 0; x < size+1; x++){
            ret = ret + collection[x].toString() + "\n";
        }
        return ret;
    }
}
