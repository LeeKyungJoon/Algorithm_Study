package Study;

import java.util.Scanner;

public class Study_Q11 {

    // 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

		int n = 0; 
		int result = 0; // 최종적으로 나오는 값
        
        try{
		System.out.print("양의 정수를 입력하세요 : ");

		n = stdIn.nextInt(); // 입력한 값을 대입

		do {
			n = n / 10; // n을 10으로 나눴을 때의 값
			result++; // result가 1씩 증가
        } 
        
        while(n > 0); // int n이 0보다 작거나 같을 때까지 반복(n은 정수형)

        System.out.println("그 수는 " + result + "자리입니다.");
        } 
        finally {
            stdIn.close();
        }

        
    }
}