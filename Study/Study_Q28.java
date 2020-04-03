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
    YMD after(int n) {
        YMD date = new YMD(this.y, this.m, this.d);

        date.d += n;

        while (date.d > mdays[isLeap(date.y)][date.m - 1]) {
			date.d -= mdays[isLeap(date.y)][date.m - 1]; // 현재보다 뒤에 날짜를 원하면 무조건 자신이 속한 월의 총 일을 처음에 뺀다.
			if (++date.m > 12) {
				date.y++;
				date.m = 1;
			}
		}
		return date;
    }

    // n일 앞의 날짜를 반환
    YMD before(int n) {
		YMD date = new YMD(this.y, this.m, this.d);
		
		date.d -= n;

		while (date.d < 1) {
			if (--date.m < 1) {
				date.y--;
				date.m = 12;
			}
			date.d += mdays[isLeap(date.y)][date.m - 1]; // 현재보다 앞에 날짜를 원하면 무조건 자신이 속한 월의 총 일을 처음에 더한다.
		}
		return date;
	}


    public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

        try {
		System.out.print("날짜를 입력하세요.\n");
		System.out.print("년：");
		int y = stdIn.nextInt();
		System.out.print("월：");
		int m = stdIn.nextInt();
		System.out.print("일：");
		int d = stdIn.nextInt();
		YMD date = new YMD(y, m, d);

		System.out.print("몇 일 앞/뒤의 날짜를 구할까요?：");
		int n = stdIn.nextInt();

		YMD d1 = date.after(n);
		System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일입니다.\n", n, d1.y, d1.m, d1.d);

		YMD d2 = date.before(n);
        System.out.printf("%d일 앞의 날짜는 %d년 %d월 %d일입니다.\n", n, d2.y, d2.m, d2.d);
        }
        finally {
            stdIn.close();
        }
	}

}