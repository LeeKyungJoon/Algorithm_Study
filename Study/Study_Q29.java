package Study;
import java.util.Scanner;

// for문을 이용하여 키 값을 찾는 메서드를 작성하시오.

class SeqSearchSen {

    static int seqSearchSen(int[] a, int n, int key) {
        
        for(int i = 0; i < n; i++) {
            if(a[i] == key) {       // 배열의 요소와 key 값이 일치하면 그 요소의 인덱스를 반환
                return  i; 
            } 
        }
        return -1;                  // 없으면 -1을 반환
        
    }

    public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

        try {
            System.out.print("요솟수：");
            int num = stdIn.nextInt();
            int[] x = new int[num];

            for (int i = 0; i < num; i++) {
                System.out.print("x[" + i + "]：");
                x[i] = stdIn.nextInt();             // 배열에 요소들 추가
            }

            System.out.print("찾는 값："); 
            int ky = stdIn.nextInt();

            int idx = seqSearchSen(x, num, ky); 

            if (idx == -1) {
                System.out.println("그 값의 요소가 없습니다.");
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