package Study;

public class Study_Q3 {
    
    // 네 값의 최솟값을 구하는 min3 메서드를 작성하세요.
    static int min4(int a, int b, int c, int d) {

        int min = a; // 변수 min에 a를 대입

        if(b < min){ // 변수 min의 값보다 b의 값이 더 작을 경우 min에 b를 대입
            min = b;
        }
        if(c < min) { // 변수 min의 값보다 c의 값이 더 작을 경우 min에 c를 대입
            min = c; 
        }
        if(d < min) { // 변수 min의 값보다 d의 값이 더 작을 경우 min에 d를 대입
            min = d;
        }
        return min; // 최종적으로 min의 값을 return
    }

    public static void main(String[] args) {
        System.out.println("min4(1, 9, 3, 2): " + min4(1, 9, 3, 2)); // 결과: 1
    }
}