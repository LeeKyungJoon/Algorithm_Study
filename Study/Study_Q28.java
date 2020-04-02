package Study;
import java.util.Scanner;

// 서기 년월일을 필드로 갖는 클래스를 만드세요.
class YMD {
	int y; 
	int m; 
	int d; 

	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 윤년
	};

	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0; // 윤년, 평년
	}

    // 생성자(주어진 날짜로 설정)
	YMD(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
    }

    // n일 뒤의 날짜를 반환
    // YMD after(int n) {

    // }


}