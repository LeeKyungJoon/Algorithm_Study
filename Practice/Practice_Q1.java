package Practice;

// import java.util.Scanner;

public class Practice_Q1 {
    
    static int max3(int a, int b, int c, int d) {
        int max = a;
        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }
        if(d > max) {
            max = d;
        }
        return max;
    }
    public static void main(String[] arg){
        System.out.println("max(7, 6, 9, 2): " + max3(7, 6, 9, 2));
    }
        
}