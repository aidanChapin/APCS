package Ch12Recursion;

public class Factorial {
    public static void main(String[] args){
        System.out.println(iterativeFactorial(4));
    }
    public static int iterativeFactorial(int x){
        for(int y = x-1; y > 1; y--){
            x = y*x;
        }
        return x;
    }
}
