package Study;
import java.util.Scanner;

public class Study_Q7 {

	//n이 7이면 '1 + 2 + 3 + 4 + 5 + 6 + 7 = 28'로 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

        try{
			System.out.println("1부터 n까지의 합을 구합니다.");
			System.out.print("n의 값：");

			int n = stdIn.nextInt();
			int sum = 0; // 최종결과를 가져올 변수

		for (int i = 1; i <= n; i++) {
			if(i < n)
				System.out.print(i + " + "); // i가 n보다 작으면 i 뒤에 +를 붙인 값을 print

			else
				System.out.print(i); // i가 n보다 크거나 같으면 i만 print

			sum += i; // 변수 sum에 i를 더한 뒤 다시 변수 sum에 대입
		}

		System.out.println(" = " + sum); // 최종적으로 print
		
        }
        finally {
            stdIn.close();
        }
	}
}
