package Inheritance;

public class LegalSecretary extends Secretary {

    public LegalSecretary(String name) {
        super(name);
    }
    public double getSalary() {
        return super.getSalary()+5000;    //$55,000 / year
    }
}