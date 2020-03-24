package Study;

import java.util.Scanner;


public class Study_Q14 {

    // 입력한 수를 한 변으로 하는 정사각형을 * 기호로 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        try{
        System.out.println("사각형을 출력합니다.");
        System.out.print("단 수: ");

        int n = stdIn.nextInt(); // 몇 줄 몇 칸 으로 할 지 입력

            for(int i = 0; i < n; i++) { // 세로줄
                for(int j = 0; j < n; j++) { 
                    System.out.print("*"); // 가로줄
                }
                System.out.println(); // 줄바꿈
            }
        }
        finally {
            stdIn.close();
        }
    }
}