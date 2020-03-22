package Practice;
import java.util.Scanner;

public class Practice_Q8 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        try{
            System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값：");
        int n = stdIn.nextInt();

        int sum = 0;
        
        if(n % 2 == 0) {
            sum = (1 + n) * (n / 2);
        } else {
            sum = n * ((n - 1)/2) + n;
        }
        System.out.println("합은: " + sum);
        }
        finally{
            stdIn.close();
        }
    }
}