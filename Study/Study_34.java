package Study;
import java.util.Arrays;
import java.util.Scanner;

public class Study_34 {

    // 검색에 실패하면 삽입 포인트의 값을 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

        try{
            System.out.print("요솟수：");
            int num = stdIn.nextInt();
            int[] x = new int[num];

            System.out.println("오름차순으로 입력하세요.");

            System.out.print("x[0]："); 
            x[0] = stdIn.nextInt(); // 오름차순대로 입력하는 부분

            for (int i = 1; i < num; i++) {
                do {
                    System.out.print("x[" + i + "]：");
                    x[i] = stdIn.nextInt();
                } while (x[i] < x[i - 1]); // 오름차순이 아닐경우 다시 입력
            }

            System.out.print("찾는 값："); 
            int ky = stdIn.nextInt();   // 찾고자 하는 값

            int idx = Arrays.binarySearch(x, ky); // java에서 제공해주는 binarySearch 메서드 이용
                                                  // 찾고자 하는 값이 없으면 찾고자 하는 값보다 큰 요소 중 첫 번째 요소의 인덱스에 - 를 한뒤 -1를 한 값을 반환
                                                  // ex. array = [1, 3, 5, 7, 9], 찾고자 하는 값: 4
                                                  // 찾고자 하는 값보다 큰 요소 중 첫번째 요소: 5, 해당 인덱스: 2
                                                  // 반환값: -3
            if (idx < 0) {                  
                int result = -idx - 1;            // result = 2, 삽입 포인트는 2
                System.out.println("그 값의 요소가 없습니다.");
                System.out.printf("삽입 포인트는 %d입니다.\n", result);
            } 
            else {
                System.out.println("그 값은 x[" + idx + "]에 있습니다.");
            }
                
        }
        finally {
            stdIn.close();
        }
		
	}
}