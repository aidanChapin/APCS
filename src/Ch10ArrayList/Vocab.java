package Ch10ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vocab {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("text1.txt");
        File file2 = new File("text2.txt");

        ArrayList<ArrayList<String>> words1 = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> words2 = new ArrayList<ArrayList<String>>();
        Scanner wordScanner1 = new Scanner("text1.txt");
        Scanner wordScanner2 = new Scanner("text2.txt");



    while(wordScanner1.hasNext()){
            String word = commonize(wordScanner1.next());
            checkUnique(word, words1.get(alphabetize(word)));
        }
        while(wordScanner2.hasNext()){
            String word = commonize(wordScanner2.next());
            ArrayList<String> list = words1.get(alphabetize(word));
            checkUnique(word, list);
        }
        for(int x = 0; x < words1.size(); x++){
            for(int y = 0; y < words1.get(x).size(); y++){
                System.out.print(words1.get(x).get(y) + ", ");
            }
        }
        for(int x = 0; x < words2.size(); x++){
            for(int y = 0; y < words2.get(x).size(); y++){
                System.out.print(words2.get(x).get(y) + ", ");
            }
        }

    }

    public static void checkUnique(String word, ArrayList<String> words) {
        word = commonize(word);
        System.out.println(word);
        boolean unique = true;
        for(int x = 0; x < words.size(); x++) {
            if(word.equals(words.get(x))){
                unique = false;
            }
            if(unique){
                words.add(word);
            }
        }

    }
    public static int alphabetize(String letter){
        char let = letter.toLowerCase().charAt(0);
        if(let == 'a'){
            return 0;
        }
        else if(let == 'b'){
            return 1;
        }
        else if(let == 'c'){
            return 2;
        }
        else if (let == 'd'){
            return 3;
        }
        else if(let == 'e'){
            return 4;
        }
        else if(let == 'f'){
            return 5;
        }
        else if(let == 'g'){
            return 6;
        }
        else if(let == 'h'){
            return 7;
        }
        else if(let == 'i'){
            return 8;
        }
        else if(let == 'j'){
            return 9;
        }
        else if(let == 'k'){
            return 10;
        }
        else if(let == 'l'){
            return 11;
        }
        else if(let == 'm'){
            return 12;
        }
        else if(let == 'n'){
            return 13;
        }
        else if(let == 'o'){
            return 14;
        }
        else if(let == 'p'){
            return 15;
        }
        else if(let == 'q'){
            return 16;
        }
        else if(let == 'r'){
            return 17;
        }
        else if(let == 's'){
            return 18;
        }
        else if(let == 't'){
            return 19;
        }
        else if(let == 'u'){
            return 20;
        }
        else if(let == 'v'){
            return 21;
        }
        else if(let == 'w'){
            return 22;
        }
        else if(let == 'x'){
            return 23;
        }
        else if(let == 'y'){
            return 24;
        }
        else if (let == 'z'){
            return 25;
        }
        else{
            return -1;
        }
    }
    public static String commonize(String word) {
        word = word.toLowerCase();
        if (word.charAt(word.length() - 1) == '.' || word.charAt(word.length() - 1) == ';' || word.charAt(word.length() - 1) == '?' || word.charAt(word.length() - 1) == '!') {
            word = word.substring(0, word.length() - 1);
        }
        return word;
    }
}
