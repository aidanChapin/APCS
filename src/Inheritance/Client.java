//This program is a client program to instantiate
//bunch of employees for a law firm. This version
//uses an array of objects of the type Employees. Each
//object is created directly at the instantiation of the
//employee array. The array is then passed to a method to
//print each employee's information.
package Inheritance;

public class Client {
    public static void main(String[] args) {
        Employee[] myEmployees = {new LegalSecretary("Tom"),
                new Marketer("Jonny"),
                new Lawyer("Henry")};
        printInfo(myEmployees);
    }

    public static void printInfo(Employee[] employee) {
        //Datatype   //iterator //container
        for (Employee staff : employee) {
            System.out.println("name: " + staff.getName());
            System.out.println("salary: " + staff.getSalary());
            System.out.println("v. days: " + staff.getVacationDays());
            System.out.println("v form: " + staff.getVacationForm());
            System.out.println();
        }
        /*
        for (int i = 0; i < employee.length; i++) {
            System.out.println("salary: " + employee[i].getSalary());
            System.out.println("v. days: " + employee[i].getVacationDays());
            System.out.println("v form: " + employee[i].getVacationForm());
            System.out.println();
        }
        */

    }

}