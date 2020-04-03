package Study;
import java.util.Scanner;

// 선형 검색의 스캐닝 과정을 상세하게 출력하세요.
class SeqSearchSen2 {
	
	static int seqSearchEx(int[] a, int n, int key) {
		System.out.print("   |");
		for (int k = 0; k < n; k++)
			System.out.printf("%3d", k);
		System.out.println();

		System.out.print(" --+");
		for (int k = 0; k < n * 3; k++)
			System.out.print("-");
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print("   |");
			// 현재 검색하고 있는 요소 위에 * 표시하기
			// 이부분은 다른 사람의 풀이를 참고(String.format이라는 메서드를 처음 봄) 다른 방법이 있나?
			System.out.printf(String.format("%%%ds*\n", (i * 3) + 2), ""); 
			System.out.printf("%3d|", i);
			for (int k = 0; k < n; k++)
				System.out.printf("%3d", a[k]);
				System.out.println(" ");
			if (a[i] == key)
				return i; 
		}
		return -1; 
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

        try {
            System.out.print("요솟수：");
            int num = stdIn.nextInt();
            int[] x = new int[num]; // 요솟수 num인 배열

            for (int i = 0; i < num; i++) {
                System.out.print("x[" + i + "]：");
                x[i] = stdIn.nextInt();
            }

            System.out.print("찾는 값："); // 키 값을 입력 받음
            int ky = stdIn.nextInt();

            int idx = seqSearchEx(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

            if (idx == -1)
                System.out.println("그 값의 요소가 없습니다.");
            else
                System.out.println(ky + "은 " + "x[" + idx + "]에 있습니다.");
        }
        finally {
            stdIn.close();
        }
	}
}