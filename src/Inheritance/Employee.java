//A class to represent employees in general (20page manual)
package Inheritance;

public class Employee {
    //state fields
    private String name;
    private int yearsOfExperience;

    public Employee(String name) {
        this.name = name;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience(){
        return yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public int getHours(){
        return 40;      //works 40 hours/week
    }

    public double getSalary() {
        return 50000.0;    //$50,000 / year
    }

    public int getVacationDays() {
        return 10;      //2 weeks' paid vacation
    }

    public String getVacationForm() {
        return "yellow";    //use the yellow form for leave
    }




}