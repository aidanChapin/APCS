package DesignClasses;

public class Student {
    private String name;
    private int grade;
    private int id;
    private int age;
    private double gpa;
    private String counselor;
    private char sex;

    public Student(String name, int grade, int id, int age, double gpa, String counselor, char sex){
        this.name = name;
        this.id = id;
        this.age = age;
        this.gpa = gpa;
        this.counselor = counselor;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return name + ", " + sex + ", " + grade + "th grade," + age + " years old.\n"
                + "GPA: " + gpa + ". Counselor: " + counselor + ". ID Number: " + id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void graduate() {
        grade++;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void birthday() {
        age++;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getCounselor() {
        return counselor;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }



}
