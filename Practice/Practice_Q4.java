package Practice;

// import java.util.Scanner;

public class Practice_Q4 {
    
    static int med3(int a, int b, int c) {
        if(a >= b){
            if(a <= c){
                return a;
            } else if(b <= c){
                return b;
            } else {
                return c;
            }
        } else if(a > c) {
            return a;
        } else if(b > c) {
            return c;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println("med3(4, 7, 1): " + med3(4, 7, 1));
    }
}