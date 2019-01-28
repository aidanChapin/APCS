package Ch10ArrayList;
import java.util.ArrayList;
public class addStars {
    public static void main (String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("the");
        list.add("quick");
        list.add("brown");
        list.add("fox");
        System.out.println(list);
        addStars(list);
        System.out.println(list);
    }
    public static void addStars(ArrayList<String> newList){
        for(int x = 1; x <= newList.size(); x += 2){
            newList.add(x,"*");
        }
    }
}
