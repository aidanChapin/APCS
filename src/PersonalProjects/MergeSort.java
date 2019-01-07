package PersonalProjects;
import java.util.ArrayList;
import java.util.Random;
public class MergeSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = createRandomArray(8, 9);
        printlnArray(list);
        breakDown(list);
    }

    public static void breakDown(ArrayList<Integer> list) {
        if (list.size() > 1) {
            int midpoint = list.size() / 2;
            ArrayList<Integer> firstHalf = new ArrayList();
            for (int x = 0; x < midpoint; x++) {
                firstHalf.add(list.get(0));
                list.remove(0);
            }
            if(list.size() == 1 && firstHalf.size() == 1) {
                System.out.print("First Half: ");
                printlnArray(firstHalf);
                System.out.print("Second Half: ");
                printlnArray(list);
                buildUp(firstHalf, list);
            }
            breakDown(firstHalf);
            breakDown(list);
        }
    }
    public static ArrayList<Integer> buildUp(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> sort = new ArrayList();
        while(list1.size() > 0 && list2.size() > 0){
            if(list1.get(0) > list2.get(0)){
                sort.add(list2.get(0));
                list2.remove(0);
            }
            else if(list1.get(0) < list2.get(0)){
                sort.add(list1.get(0));
                list1.remove(0);
            }
            else if(list1.get(0) == list2.get(0)) {
                sort.add(list1.get(0));
                sort.add(list2.get(0));
                list1.remove(0);
                list2.remove(0);
            }
        }
        if(list1.size() == 0) {
            for (int x = 0; x < list2.size(); x++) {
                sort.add(list2.get(0));
                list2.remove(0);
            }
        }
        if(list2.size() == 0){
            for(int x = 0; x < list1.size(); x++){
                sort.add(list1.get(0));
                list1.remove(0);
            }
        }
        System.out.print("Sorted Array: ");
        printlnArray(sort);
        System.out.println();
        return sort;
    }
    public static void printArray(ArrayList list){
        for(int x = 0; x < list.size(); x++){
            System.out.print(list.get(x) + " ");
        }
    }
    public static void printlnArray(ArrayList list){
        for(int x = 0; x < list.size(); x++){
            System.out.print(list.get(x) + " ");
        }
        System.out.println();
    }
    public static ArrayList<Integer> createRandomArray(int size, int range) {
        Random rand = new Random();
        ArrayList<Integer> ret = new ArrayList();
        for (int x = 0; x < size; x++) {
            ret.add(rand.nextInt(range));
        }
        return ret;
    }
}