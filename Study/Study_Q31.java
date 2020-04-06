package Study;
import java.util.Scanner;


class Search {

    // 요솟수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞에서부터 순서대로 저장하고, 일치하는 요솟수를
    // 반환하는 메서드를 작성하세요.
    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int j = 0;

        for(int i = 0; i < n; i++) {
            if(a[i] == key) {
                idx[j] = i;
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        try {
            System.out.print("요솟수: ");
            int num = stdIn.nextInt();
            int[] x = new int[num];
            int[] y = new int[num];

            for (int i = 0; i < num; i++) {
                System.out.print("x[" + i + "]：");
                x[i] = stdIn.nextInt();             // 배열에 요소들 추가
            }

            System.out.print("찾는 값："); 
            int ky = stdIn.nextInt();

            int result = searchIdx(x, num, ky, y);

            System.out.println("일치한 요솟수는 " + result + "개 입니다.");

        }
        finally {
            stdIn.close();
        }
    }
}