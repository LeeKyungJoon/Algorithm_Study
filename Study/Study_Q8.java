package Study;
import java.util.Scanner;

public class Study_Q8 {

    // 가우스의 덧셈이라는 방법을 이용하여 1부터 n까지의 정수의 합을 구하는 프로그램을 작성하시오.
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        try{
            System.out.println("1부터 n까지의 합을 구합니다.");
            System.out.print("n의 값：");
            
            int n = stdIn.nextInt();
            int sum = 0; // 최종결과를 가져올 변수
        
        if(n % 2 == 0) {
            sum = (1 + n) * (n / 2); // n이 짝수면 1과 n을 더한 뒤 n을 곱하고 2를 나눈 값을 sum에 대입
        } else {
            sum = n * ((n - 1)/2) + n; // 마지막 값을 제외한 뒤 n이 홀수면 1과 n을 더한 값에서 1을 빼고 (n - 1)을 곱한 뒤 2 나눔
                                       // 제외한 마지막 값을 더한 뒤 sum에 대입
        }

        System.out.println("합은: " + sum);

        }
        finally{
            stdIn.close();
        }
    }
}