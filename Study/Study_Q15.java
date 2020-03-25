package Study;
import java.util.Scanner;


public class Study_Q15 {

	// 왼쪽 아래가 직각인 이등변삼각형을 출력
	public static void triangleLB(int n) {
		for (int i = 0; i < n; i++) { 				
			for (int j = 0; j <= i; j++) { // i만큼 횟수를 제한
				System.out.print('*');
			}
			System.out.println(); 					
		}
	}

	// 왼쪽 위가 직각인 이등변삼각형을 출력
	public static void triangleLU(int n) {
		for (int i = 0; i < n; i++) { 				
			for (int j = 0; j < n - i; j++) { // 역으로 해야하기 때문에 n에서 i를 뺀 수만큼 제한
				System.out.print('*');
			}
			System.out.println(); 					
		}
	}

	// 오른쪽 위가 직각인 이등변삼각형을 출력
	public static void triangleRU(int n) {
		for (int i = 0; i < n; i++) { 				
			for (int j = 0; j < i; j++) {		
				System.out.print(' ');      // 앞 부분에 빈공간 필요
			}
			for (int k = 0; k < n - i; k++) {
				System.out.print('*');      // 역으로 해야하기 때문에 n에서 i를 뺀 수만큼 제한
			}
			System.out.println();					
		}
	}

	// 오른쪽 아래가 직각인 이등변삼각형을 출력
	static void triangleRB(int n) {
		for (int i = 0; i < n; i++) { 				
			for (int j = 0; j < n - i; j++) {
				System.out.print(' ');	// 앞 부분에 빈공간 필요
			}
			for (int k = 0; k < i + 1; k++) {		
				System.out.print('*');      // i가 0부터 시작하기 때문에 +1를 함
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

            triangleLB(n); // 왼쪽 아래가 직각인 이등변삼각형
            System.out.println();

            triangleLU(n); // 왼쪽 위가 직각인 이등변삼각형
            System.out.println();

            triangleRU(n); // 오른쪽 위가 직각인 이등변삼각형
            System.out.println();

            triangleRB(n); // 오른쪽 아래가 직각인 이등변삼각형
            System.out.println();
        }
        finally {
            stdIn.close();
        }


		
	}
}