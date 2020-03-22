package Study;


public class Study_Q1 {
    
    // 네 값의 최댓값을 구하는 max4 메서드를 작성하세요.
    static int max4(int a, int b, int c, int d) {

        int max = a; // 변수 max에 a를 대입

        if(b > max) { // 변수 max의 값보다 b의 값이 더 클 경우 max에 b를 대입
            max = b;
        }

        if(c > max) { // 변수 max의 값보다 c의 값이 더 클 경우 max에 c를 대입
            max = c;
        }

        if(d > max) { // 변수 max의 값보다 d의 값이 더 클 경우 max에 d를 대입
            max = d;
        }

        return max; // 최종적으로 max의 값을 return
    }
    public static void main(String[] arg) {
        System.out.println("max(7, 6, 9, 2): " + max4(7, 6, 9, 2)); // 결과: 9
    }
        
}