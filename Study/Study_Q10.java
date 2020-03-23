package Study;

import java.util.Scanner;

public class Study_Q10 {

    // 두 변수 a, b에 정수를 입력하고 b - a를 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        try {
            System.out.println("a의 값: ");

            int a = stdIn.nextInt(); // a의 값 입력
            int b = 0; // 변수 b 설정

            while( a >= b) { // a가 b보다 크거나 같으면 반복
                System.out.println("b의 값: ");

                b = stdIn.nextInt(); // b의 값 입력

                if(b > a) { // a 보다 b가 더 큰 값이 입력되면 break
                    break;
                }

                System.out.println("a보다 큰 값을 입력하세요!");
            }

			System.out.println("b - a는 " + (b - a) + "입니다.");
        } 
        finally {
            stdIn.close();
        }
    }
}