package Study;
import java.util.Scanner;


public class Study_Q26 {

    static int[][] mdays = {
        {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
        {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    // 그 해 남은 일 수를 구하는 메서드를 작성하세요.
    static int leftdayOfYear(int y, int m, int d) {
        while(--m != 0) {      // 조건을 제대로 걸어야 된다.(조건을 다르게 할 수도 있지 않을까?)            
            d += mdays[isLeap(y)][m - 1]; // 남은 날짜 자체에다가 각 월에 해당하는 일수를 더함
        }
        if(isLeap(y) == 1) {
            return 366 - d; // isLeap(y) == 1 이면 윤년이여서 366
        }
        else {
            return 365 - d; // isLeap(y) == 0 이면 평년이여서 365
        }
    }

    public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

        try {
            System.out.println("연내의 남은 일 수를 구합니다.");

            System.out.print("년：");
            int year = stdIn.nextInt(); 
            System.out.print("월：");
            int month = stdIn.nextInt(); 
            System.out.print("일：");
            int day = stdIn.nextInt(); 

            System.out.printf("연내 " + leftdayOfYear(year, month, day) + "일 남았습니다.\n");

        }
        finally{
            stdIn.close();
        }
	}
}