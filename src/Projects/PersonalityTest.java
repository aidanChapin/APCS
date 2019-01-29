package Projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
public class PersonalityTest {
    public static void main(String[] args) throws FileNotFoundException {
       startUp();
    }
    public static void startUp()throws FileNotFoundException{
        Scanner scan = new Scanner(System.in);
        System.out.print("Input file name: ");
        File input = new File(scan.next());
        boolean fileFound = false;
        if(input.exists()){

        }
        else {
            while (fileFound == false) {
                System.out.print("File not found. Try again: ");
                input = new File(scan.next());
                if (input.exists()) {
                    fileFound = true;
                }
            }
        }
        System.out.print("Output file name: ");
        File output = new File(scan.next());
        readFile(input, output);
    }
    public static void readFile(File input, File output)throws FileNotFoundException {
        PrintStream printStream = new PrintStream(output);
        Scanner fileScanner = new Scanner(input);

        while (fileScanner.hasNext()) {
            String name = fileScanner.nextLine();
            printStream.println(name);
            String line = fileScanner.nextLine().toLowerCase();
            int[] answers = new int[8];
            for (int x = 0; x < 8; x++) {
                answers[x] = 0;
            }

            for (int x = 0; x < 70; x += 7) {
                String data = "";
                for (int z = x; z < x + 7; z++) {
                    data = data + line.toLowerCase().charAt(z);
                }
                for (int y = 0; y < 7; y++) {
                    if (y == 0) {
                        if (data.charAt(y) == 'a') {
                            answers[0]++;
                        }
                        if (data.charAt(y) == 'b') {
                            answers[1]++;
                        }
                    }
                    if (y == 1 || y == 2) {
                        if (data.charAt(y) == 'a') {
                            answers[2]++;
                        }
                        if (data.charAt(y) == 'b') {
                            answers[3]++;
                        }
                    }
                    if (y == 3 || y == 4) {
                        if (data.charAt(y) == 'a') {
                            answers[4]++;
                        }
                        if (data.charAt(y) == 'b') {
                            answers[5]++;
                        }
                    }
                    if (y == 5 || y == 6) {
                        if (data.charAt(y) == 'a') {
                            answers[6]++;
                        }
                        if (data.charAt(y) == 'b') {
                            answers[7]++;
                        }
                    }
                }
            }
            printStream.println(answers[0] + "A-" + answers[1] + "B " + answers[2] + "A-" + answers[3] + "B " + answers[4]
                    + "A-" + answers[5] + "B " + answers[6] + "A-" + answers[7] + "B");
            calculateType(answers, printStream);
            printStream.println();
        }
    }
    public static void calculateType(int[] answers, PrintStream printStream)throws FileNotFoundException{
        String[] type = new String[4];
        int[] percents = new int[4];
        if(answers[0] > answers[1]){
            type[0] = "E";
            percents[0] = answers[1]*100/(answers[0]+answers[1]);
        }
        else if (answers[1] > answers[0]){
            type[0] = "I";
            percents[0] = answers[1]*100/(answers[0]+answers[1]);
        }
        else{
            type[0] = "X";
            percents[0] = answers[1]*100/(answers[0]+answers[1]);
        }

        if(answers[2] > answers[3]) {
            type[1] = "S";
            percents[1] = answers[3] * 100 / (answers[2] + answers[3]);
        }
        else if (answers[3] > answers[2]){
            type[1] = "N";
            percents[1] = answers[3]*100/(answers[2]+answers[3]);
        }
        else{
            type[1] = "X";
            percents[1] = answers[3]*100/(answers[2]+answers[3]);
        }

        if(answers[4] > answers[5]){
            type[2] = "T";
            percents[2] = answers[5]*100/(answers[4]+answers[5]);
        }
        else if (answers[5] > answers[4]){
            type[2] = "F";
            percents[2] = answers[5]*100/(answers[4]+answers[5]);
        }
        else{
            type[2] = "X";
            percents[2] = answers[5]*100/(answers[4]+answers[5]);
        }

        if(answers[6] > answers[7]){
            type[3] = "J";
            percents[3] = answers[7]*100/(answers[6]+answers[7]);
        }
        else if (answers[7] > answers[6]){
            type[3] = "P";
            percents[3] = answers[7]*100/(answers[6]+answers[7]);
        }
        else{
            type[3] = "X";
            percents[3] = answers[7]*100/(answers[6]+answers[7]);
        }
        printStream.println("[" + percents[0]+"%, " + percents[1] + "%, " + percents[2]+"%, " + percents[3] + "%] = " + type[0]+type[1]+type[2]+type[3]);

    }
}



