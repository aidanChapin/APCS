package DesignClasses;

public class Stock {
    private String symbol;
    private double totalCost;
    private int shares;

    public void buy(int shares, double value){
        this.shares += shares;
        totalCost += (value*shares);
    }
    public Stock(String symbol){

    }
    public double profit(double curved){
        return 0;
    }
    public String toString(){
        return null;
    }
}
