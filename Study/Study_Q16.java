package Study;
import java.util.Scanner;


public class Study_Q16 {

    // n단의 피라미드를 출력하는 메서드를 작성하세요.
	public static void spira(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) { // n - i번의 횟수만큼 빈 공간 출력 
				System.out.print(' ');
			}
			for (int k = 0; k <= (i * 2); k++) { // 빈공간과 *표시의 합이 n + i + 1 만큼 반복
				System.out.print('*');			 // 빈공간을 뺀 나머지만큼 *표시를 함
			}
			
			System.out.println(); 	
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		try {
            System.out.println("삼각형을 출력합니다.");
            System.out.print("단 수: ");

			int n = stdIn.nextInt(); // 몇 줄 몇 칸 으로 할 지 입력
			
			spira(n);
        }
        finally {
            stdIn.close();
        }
	}
}