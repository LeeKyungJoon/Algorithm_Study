package Study;
import java.util.Scanner;


public class Study_Q25 {

    static int[][] mdays = {
        {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
        {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    // 메서드 dayOfYear를 변수 i와 days 없이 구현하세요. while문을 사용하세요.
    static int dayOfYear(int y, int m, int d) {
        while(--m != 0) {      // 조건을 제대로 걸어야 된다.(조건을 다르게 할 수도 있지 않을까?)            
            d += mdays[isLeap(y)][m - 1]; // 남은 날짜 자체에다가 각 월에 해당하는 일수를 더함
        }
        return d;   // 전부 더한 값을 return
    }

    public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

        try {
            System.out.println("연내의 경과 일 수를 구합니다.");

            System.out.print("년：");
            int year = stdIn.nextInt(); 
            System.out.print("월：");
            int month = stdIn.nextInt(); 
            System.out.print("일：");
            int day = stdIn.nextInt(); 

            System.out.printf("연내 " + dayOfYear(year, month, day) + "일째입니다.\n");

        }
        finally{
            stdIn.close();
        }
	}
}