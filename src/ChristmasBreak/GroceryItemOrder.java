package ChristmasBreak;

public class GroceryItemOrder {
    private int quantity;
    private String name;
    private double price;

    public GroceryItemOrder(int quantity, String name, double price){
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price*quantity;
    }

    @Override
    public String toString() {
        return quantity + "\t" + name + "\t$" + price + "\n";
    }
}
