package Aggregation;

public class Address {
    private int number;
    private String streetName;
    private String city;
    private String state;
    private int zip ;
    private String country;

    public Address(int number, String streetName){
        this.number = number;
        this.streetName = streetName;
    }
    public Address(int number, String streetName, String city, String state, int zip){
        this.number = number;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Address(int number, String streetName, String city, String state, int zip, String country){
        this.number = number;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }
}
