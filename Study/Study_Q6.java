package Study;

import java.util.Scanner;

public class Study_Q6 {
    
    // while문이 종료될 때 변수 i 값이 n + 1이 됨을 확인하세요.
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        try {
            System.out.println("1부터 n까지의 합을 구합니다.");
            System.out.println("n의 값:");

            int n = stdIn.nextInt();
            int sum = 0; // 최종결과를 가져올 변수
            int i = 1; // 처음 시작 값을 1로 대입

        while(i <= n) {
            sum += i; // 변수 sum에 i를 더한 뒤 다시 변수 sum에 대입
            i++; // 변수 i를 1씩 증가
            System.out.println("i의 값: " + i); // i의 값을 확인하는 부분
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");}

        finally {
            stdIn.close();
        }
    }
}