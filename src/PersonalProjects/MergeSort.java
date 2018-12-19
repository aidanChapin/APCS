package PersonalProjects;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class MergeSort {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList();
        Random rand = new Random();
        for(int x = 0; x < 8; x ++){
            list.add(rand.nextInt(9));
        }
        printlnArray(list);
        breakDown(list);
    }
    public static void breakDown(ArrayList<Integer> list) {
        printlnArray(list);
        if (list.size() > 2) {
            int midpoint = list.size() / 2;
            ArrayList<Integer> split = new ArrayList();
            for (int x = 0; x < midpoint; x++) {
                split.add(list.get(0));
                list.remove(0);
            }
            breakDown(split);
            breakDown(list);
        }
        
    }
    public static void buildUp(){

    }
    public static void printArray(ArrayList list){
        for(int x = 0; x < list.size(); x++){
            System.out.print(list.get(x));
        }
    }

    public static void printlnArray(ArrayList list){
        for(int x = 0; x < list.size(); x++){
            System.out.print(list.get(x));
        }
        System.out.println();
    }
}
