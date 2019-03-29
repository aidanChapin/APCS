package PersonalProjects;
public class Ftwelve {
    public static void main(String[] args){
    //System.out.println(f(f(f(f(0)))));
    }
    /*public static int f(int x) {
        int ret = 0;
        if( x >= 10)
        return ret;
    }*/
    public static int f(int x, int y) {
        int ret = 0;
        if (x > 5) {
            ret = f(x-2, y + 1) + x;
        } else if (0 <= x && x<= 5) {
            ret = f(x - 3, y + 2) + y;
        } else if (x < 0){
            ret = (x*x) + x;
        }
        return ret;
    }
}

