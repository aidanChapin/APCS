package Inheritance;

public class Lawyer extends Employee{
    //inherit methods from the Employees class

    public Lawyer(String name) {
        super(name);
    }

    //override the inherited methods from the Employee class
    public int getVacationDays() {
        return 15;      //3 weeks' paid vacation
    }

    public String getVacationForm() {
        return "pink";    //use the pink form for leave
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }


}