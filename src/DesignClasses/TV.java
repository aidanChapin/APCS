package DesignClasses;

public class TV {
    private String manufacturer;
    private String model;
    private double price;
    private String owner;
    private boolean on;
    private int channel;


    TV(String manufacturer, String model, double price, String owner, boolean on, int channel) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.owner = owner;
        this.on = on;
        this.channel = channel;
    }

    @Override
    public String toString() {
        if(on == true) {
            return  owner + "'s TV \n"
                    + manufacturer + " " + model + ", $" + price + ". \n"
                    + "Currently on, set to channel " + channel;
        }
        return  owner + "'s TV \n"
                + manufacturer + " " + model + ", $" + price + ". \n"
                + "Currently off, set to channel " + channel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public int getChannel() {
        return channel;
    }

    public void changeChannel(int channel) {
        this.channel = channel;
    }

    public void channelUp() {
        channel++;
    }
    public void channelDown(){
        channel--;
    }

}
