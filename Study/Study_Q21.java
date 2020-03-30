package Study;
import java.util.Scanner;

public class Study_Q21{

    // 배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하세요.
    public static void copy(int[] a, int[] b) {
           for(int i = 0; i < b.length; i++){
                a[i] = b[i];                   // b의 요소들을 a에 복사
            }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        try {
            System.out.print("b의 길이: ");     // b의 길이 정하기
            int arr = stdIn.nextInt();
            int[] b = new int[arr];

            System.out.print("a의 길이: ");     // a의 길이 정하기
            int arr1 = stdIn.nextInt();
            int[] a = new int[arr1];

            if( a.length == b.length) {

                for (int i = 0; i < b.length; i++) {
                    System.out.print("b[" + i + "]: ");     // b의 요소들 정하기
                    b[i] = stdIn.nextInt();
                }

                copy(a,b);      // 위에서 만든 method 사용

                for (int i = 0; i < a.length; i++) {
                        System.out.println("a[" + i +"]: " + a[i]); // 결과적으로 a의 요소들 확인
                }

            } else {
                System.out.print("a와 b의 길이가 다릅니다."); // a와 b의 길이가 같아야함
            }
            
            
        }
        finally {
            stdIn.close();
        }
    }
}

