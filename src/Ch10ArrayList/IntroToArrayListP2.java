package Ch10ArrayList;
import java.util.ArrayList;

public class IntroToArrayListP2 {
    public static void main (String[] args){
        ArrayList<String> students = new ArrayList<String>();
        students.add("Matt");
        System.out.println(students);
        students.add(0,"Jonny");
        System.out.println(students);
        students.add(0, "Aidan C");
        System.out.println(students);
        if(students.contains("Jonny")){
            students.remove(students.indexOf("Jonny"));
        }
        System.out.println(students);
    }
}