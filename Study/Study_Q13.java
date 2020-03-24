package Study;


public class Study_Q13 {

    //위쪽과 왼쪽에 더하는 수가 있는 덧셈표를 출력하는 프로그램을 작성하세요
    public static void main(String[] args) {
        System.out.println("    덧셈표");

        System.out.printf("    |");
        for(int i = 1; i <= 9; i++) {
            System.out.printf("%3d", i); // 위쪽 123456789 출력(최소 3자리 이상 정수로 줄맞춤)
        }
        System.out.println("\n  ---+---------------------------");

        for(int i = 1; i <= 9; i++) {
            System.out.printf("%3d |", i); // 왼쪽 123456789 출력(최소 3자리 이상 정수로 줄맞춤)

            for(int j = 1; j <= 9; j++) { 
                System.out.printf("%3d", i + j); // 위쪽과 왼쪽을 더한 결과를 출력(최소 3자리 이상 정수로 줄맞춤)
            }
            System.out.println(); // 줄바꿈
        }
    }
}