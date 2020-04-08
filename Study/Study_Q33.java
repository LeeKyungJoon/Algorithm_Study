package Study;

import java.util.Scanner;

public class Study_Q33 {

    // 찾는 값의 맨 앞의 요소를 찾는 binSearchX 메서드를 작성하세요.
    static int binSearchX(int[] a, int n, int key) {
		
        int start = 0;
        int end = n - 1;

        int center = (start + end) / 2;

        do {
            if(a[center] < key) {
                end = center - 1;   // 찾는 값이 중앙의 값보다 작으면 뒤쪽 절반 없앰
            }
            else if(a[center] > key) {
                start = center + 1; // 찾는 값이 중앙의 값보다 크면 앞쪽 절반 없앰
            }
            else {                                  
                for(; start < center; ) {   // 찾은 값과 중앙 값이 같은 경우
                    if(a[center - 1] < key) {   // 찾은 값이 여러 개 일경우 제일 처음에 오는 값의 인덱스를 반환
                        break;
                    }
                    center--;
                }
                return center;
            }
        }
        while(start <= end);
        
        return -1;
    }

    public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

        try {
            System.out.print("요솟수：");
            int num = stdIn.nextInt();
            int[] x = new int[num]; 

            System.out.println("오름차순으로 입력하세요.");

            System.out.print("x[0]："); 
            x[0] = stdIn.nextInt();

            for (int i = 1; i < num; i++) { // 오름차순으로 입력해야하기 때문
                do {
                    System.out.print("x[" + i + "]：");
                    x[i] = stdIn.nextInt();
                } while (x[i] < x[i - 1]); 
            }

            System.out.print("찾는 값：");
            int ky = stdIn.nextInt();

            int idx = binSearchX(x, num, ky); 

            if (idx == -1) {
                System.out.println("그 값의 요소가 없습니다.");
            }
            else {
                System.out.println(ky + "은 x[" + idx + "]에 있습니다.");
            }
        }
        finally {
            stdIn.close();
        }
		
	}
}