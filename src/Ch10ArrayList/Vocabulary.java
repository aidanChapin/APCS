package Ch10ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vocabulary {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input1 = new Scanner(new File("text1.txt"));
        Scanner input2 = new Scanner(new File("text2.txt"));
        System.out.println(overlap(getWords(input1), getWords(input2)));
    }
    //This methods reads in all the data from an external file
    //applies case folding. ArrayList is then sorted to
    //eliminate duplicates. The method returns an ArrayList
    //of Strings that are unique.
    public static ArrayList<String> getWords(Scanner input) {
        //read all words and sort
        ArrayList<String> words = new ArrayList<String>();
        while (input.hasNext()) {//input.useDelimter("[^a-zA-Z']+");
            words.add(commonize(input.next()));
        }
        Collections.sort(words);
        //eliminate the duplicates in the ArrayList
        ArrayList<String> uniqueWords = new ArrayList<String>();
        if (words.size() > 0) {
            uniqueWords.add(words.get(0));
            for (int i = 1; i < words.size(); i++) {
                if (!words.get(i).equals(words.get(i - 1))) {
                    uniqueWords.add(words.get(i));
                }
            }
        }
        return uniqueWords;
    }
    public static String commonize(String word) {
        word = word.toLowerCase();
        if (word.charAt(word.length() - 1) == '.' || word.charAt(word.length() - 1) == ';'
                || word.charAt(word.length() - 1) == '?' || word.charAt(word.length() - 1) == '!'
                || word.charAt(word.length() - 1) == ',' ) {
            word = word.substring(0, word.length() - 1);
        }
        return word;
    }
    public static int overlap(ArrayList<String> list1, ArrayList<String> list2){
        int overlapCount = 0;
        int size = list2.size();
        for(int x = 0; x < list1.size(); x++){
            for(int y = 0; y < list2.size(); y++){
                if(list1.get(x).equals(list2.get(y))){
                    overlapCount++;
                }
            }
        }
        return overlapCount;
    }
}