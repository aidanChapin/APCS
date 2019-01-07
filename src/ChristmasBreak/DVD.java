package ChristmasBreak;

public class DVD {
    private String title;
    private String director;
    private int year;
    private double cost;
    private boolean bluray;

    @Override
    public String toString() {
        if(bluray == true) {
            return ("$" + cost + "\t " + year + "\t " + title + "\t " + director + "\t Blu-ray");
        }
        else{
            return ("$" + cost + "\t " + year + "\t " + title + "\t " + director);
        }
    }

    public DVD(String title, String director, int year, double cost, boolean bluray){
        this.title = title;
        this.director = director;
        this.year = year;
        this.cost = cost;
        this.bluray = bluray;
    }
    public double getCost(){
        return cost;
    }
}

