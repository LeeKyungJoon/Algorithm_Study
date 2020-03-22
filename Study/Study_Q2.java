package Study;

public class Study_Q2 {
    
    // 세 값의 최솟값을 구하는 min3 메서드를 작성하세요.
    static int min3(int a, int b, int c) {

        int min = a; // 변수 min에 a를 대입

        if(b < min){ // 변수 min의 값보다 b의 값이 더 작을 경우 min에 b를 대입
            min = b;
        }

        if(c < min) { // 변수 min의 값보다 c의 값이 더 작을 경우 min에 c를 대입
            min = c; 
        }
        
        return min; // 최종적으로 min의 값을 return
    }

    public static void main(String[] args) {
        System.out.println("min3(7, 2, 3): " + min3(7, 2, 3)); // 결과: 2
    }
}