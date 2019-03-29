package Inheritance;

public class Marketer extends Employee {

    public Marketer(String name) {
        super(name);
    }

    public double getSalary() {
        //I want to add $10k to the base salary from the Employee class
        return super.getSalary() + 10000 ;    //$50,000 / year
    }

    public void advertise() {
        System.out.println("I'll convince  you to "
                + "hire our law firm.");
    }
}