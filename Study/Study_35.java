package Study;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;


// 시력에 대한 내림차순 정렬의 신체검사 데이터에 대한 특정 시력을 가진 사람을 검색하는 프로그램을 작성하세요.
class Study_35 {

    static class PhyscData {
		private String name; 
		private int height; 
		private double vision; 

		
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		public String toString() {
			return name + " " + height + " " + vision;
		}

		// 시력 내림차순 comparator
		public static Comparator<PhyscData> VISION_ORDER = new Comparator<PhyscData>() {

            @Override
            public int compare(PhyscData d1, PhyscData d2) {    // 내림차순 일 경우
                if(d1.vision < d2.vision) {
                    return 1;                           // return 1 이면 d1이 d2보다 앞쪽에 있다.
                } else if( d1.vision > d2.vision) {
                    return -1;                          // return -1 이면 d2가 d1보다 뒤쪽에 있다.
                } else {
                    return 0;
                }
			}
        };
    }
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        try {
            PhyscData[] x = {
                            new PhyscData("이수민", 175, 2.0), 
                            new PhyscData("홍준기", 171, 1.5), 
                            new PhyscData("이호연", 174, 1.2), 
                            new PhyscData("김한결", 169, 0.8),
                            new PhyscData("전서현", 173, 0.7),
                             new PhyscData("유지훈", 168, 0.4),
                             new PhyscData("이나령", 162, 0.3),
            };

            System.out.print("찾는 시력은：");
            double vision = stdIn.nextDouble(); 
            int idx = Arrays.binarySearch(x, new PhyscData("", 0, vision), PhyscData.VISION_ORDER);

            if (idx < 0) {
                        System.out.println("그 값의 요소가 없습니다.");
            }
                
            else {
                System.out.println("그 값은 " + "x[" + idx + "]에 있습니다.");
                System.out.println("데이터：" + x[idx]);
            }
        }
        finally {
            stdIn.close();
        }
    }
}