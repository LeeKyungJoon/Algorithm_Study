package Study;
// import java.util.Scanner;

public class Study_Q19 {

    // 배열 요소를 역순으로 정렬하시오.
    public static void main(String[] args) {

        int[] a = {5, 10, 73, 2, -5, 42};

        for(int i = 0; i < (a.length) / 2; i++) { // 맨 앞과 맨 뒤를 바꾼다.
            int t = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - 1 - i] = t;
        }
        for(int i = 0; i < a.length; i++) // 최종적으로 바뀐 배열 출력
        System.out.print(a[i] + " ");
    }
}