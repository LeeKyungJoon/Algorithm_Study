package Study;
import java.util.Scanner;

public class Study_Q23 {

    // 배열의 앞쪽에 아랫자리가 아닌 윗자리를 넣어두는 메서드를 작성하세요.
    static int cardConv(int x, int r, char[] d, char[] f) {
        int digits = 0;
        int j = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);
        
        for(int i = d.length - 1; i >= 0; i--) {
            f[j] = d[i];
            System.out.print(f[j]);
            j++;
        }
        System.out.println(" ");
        return digits;
    }

    public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no; // 변환하는 정수
		int cd; // 기수
		int retry; // 다시 한 번?
        char[] cno = new char[32]; // 변환 뒤의 각 자리를 저장하는 문자인 배열
        char[] f = new char[32];
        
        try{
            System.out.println("10진수를 기수변환합니다.");
            do {
                do {
                    System.out.print("변환하는 음이 아닌 정수：");
                    no = stdIn.nextInt();
                } while (no < 0);

                do {
                    System.out.print("어떤 진수로 변환할까요? (2~36)：");
                    cd = stdIn.nextInt();
                } while (cd < 2 || cd > 36);

                System.out.print(cd + "진수로는 ");
                cardConv(no, cd, cno, f); // no를 cd진수로 변환

                System.out.print("한번 더 할까요? (1.예/0.아니오)：");
                retry = stdIn.nextInt();
            } while (retry == 1);
        }
        finally {
            stdIn.close();
        }
	}


}
