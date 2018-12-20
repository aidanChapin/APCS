package PersonalProjects;
import java.util.ArrayList;
import java.util.Random;
public class MergeSort {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> breakDown(ArrayList<Integer> list) {
        if (list.size() > 1) {
            int midpoint = list.size() / 2;
            ArrayList<Integer> firstHalf = new ArrayList();
            for (int x = 0; x < midpoint; x++) {
                firstHalf.add(list.get(0));
                list.remove(0);
            }
            if(list.size() == 1 && firstHalf.size() == 1) {
                buildUp(list, firstHalf);
            }
            breakDown(firstHalf);
            breakDown(list);
        }
        return list;
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
