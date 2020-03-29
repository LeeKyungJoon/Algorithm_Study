package Study;
import java.util.Scanner;

public class Study_Q20 {

    // 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요.
    public static int sumOf(int[] a){
        int result = 0;

        for(int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        try {
            System.out.print("길이: ");
		    int arr = stdIn.nextInt();	 // 배열 총 길이 정하기
		    int[] a = new int[arr]; 	// 길이가 num인 배열 a

		for (int i = 0; i < arr; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}

        System.out.println("모든 요소의 합계: " + sumOf(a)); // 총 배열의 합계
        }
        finally {
            stdIn.close();
        }
    }
}