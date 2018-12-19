package DesignClasses;

public class Bike {
    private int gear;
    private String brand;
    private String owner;
    private String model;
    private boolean inMotion;
    private int speed;
    private String color;

    public Bike(int gear, String brand, String owner, String model, boolean inMotion, int speed, String color){
        this.gear = gear;
        this.brand = brand;
        this.owner = owner;
        this.model = model;
        this.inMotion = inMotion;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public String toString() {
        if(inMotion == true) {
            return owner + "'s bike, " + color + " " + brand + " " + model + ".\n"
                    + "Currently in motion, going " + speed + " mph, in gear " + gear + ".\n";
        }
        else{
            return owner + "'s bike, " + color + " " + brand + " " + model + ".\n"
                    + "Currently parked in gear " + gear + ".\n";
        }
    }

    public String getColor() {
        return color;
    }

    public void paint(String color) {
        this.color = color;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public String getBrand() {
        return brand;
    }

    public String getOwner() {
        return owner;
    }

    public void sellTo(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public boolean isInMotion() {
        return inMotion;
    }

    public void go(int speed) {
        inMotion = true;
        this.speed = speed;
    }

    public void stop(){
        inMotion = false;
        speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
