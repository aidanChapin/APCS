package ChristmasBreak;

public class DVDCollection {
    int size = 10;
    private DVD collection[] = new DVD[size];

    @Override
    public String toString() {
        return("My DVD Collection \n\n" +
                "Number of DVDs: " + size +"\n" +
                "Total Cost: " + totalCost() +"\n" +
                "Average Cost: " + averageCost() + "\n\n" +
                "DVD List: " + "\n\n" +
                listToString());
    }
    public void increaseSize(){
        size++;
    }
    public void addDVD(DVD newDVD){
        boolean end = false;
        int x = -1;
        while(end == false){
            x++;
            if(collection[x] == null){
                collection[x] = newDVD;
                end = true;
            }
        }
    }
    public double totalCost(){
        double total = 0;
        boolean end = false;
        int x = -1;
        while(end == false){
            x++;
            if(collection[x] != null){
                total = total + collection[x].getCost();
            }
            else{
                end = true;
            }
        }
        return total;
    }
    public double averageCost(){
        double total = 0;
        boolean end = false;
        int x = -1;
        while(end == false){
            x++;
            if(collection[x] != null){
                total = total + collection[x].getCost();
            }
            else{
                end = true;
            }
        }
        return total/x;
    }
    public String listToString(){
        String ret = "";
        int x = -1;
        boolean end = false;
        while(end == false){
            x++;
            if(collection[x] != null) {
                ret = ret + collection[x].toString() + "\n";
            }
            else{
                end = true;
            }
        }
        return ret;
    }
}