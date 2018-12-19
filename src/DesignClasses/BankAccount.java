package DesignClasses;

public class BankAccount {
    private double balance;
    private int pin;
    private String name;
    private int ssn;
    private String address;
    private String dob;

    public BankAccount(double balance, int pin, String name, int ssn, String address, String dob){
        this.balance = balance;
        this.pin = pin;
        this.name = name;
        this.ssn = ssn;
        this.address = address;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return name + "'s bank account. Pin: " + pin + ". SSN: " + ssn + ".\n"
                + "Balance: " + balance + ".\n"
                + "Address: " + address + ". Date of birth: " + dob + ".";
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit){
        balance += deposit;
    }

    public void withdrawl(double withdrawl){
        balance -= withdrawl;
    }
    public int getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }


    public int getSsn() {
        return ssn;
    }

    public String getAddress() {
        return address;
    }

    public void changeAdress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }
}
