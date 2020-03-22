package Study;

public class Study_Q4 {
    
    // 세 값의 대소 관계 13종류의 모든 조합에 대해 중앙값을 구하여 출력하는
    // 프로그램을 작성하세요.
    static int med3(int a, int b, int c) {

        if(a >= b){

            if(a <= c){
                return a; // a >= b, a <=c 모두 true일 경우 a를 return 
            } 

            else if(b <= c){ 
                return b; // a >= b, b <= c 모두 true일 경우 b를 return 
            } 
            
            else { 
                return c; // a >= b true, a <= c false, b <= c false일 경우 c를 return 
            }
        } 
        
        else if(a > c) { 
            return a; // a >= b false, a > c true일 경우 a를 return
        } 
        
        else if(b > c) { // a >= b false, a > c false, b > c true일 경우 c를 return
            return c;
        } 
        
        else {
            return b; // 전부 false일 경우 b를 return 
        }
    }

    public static void main(String[] args) {
        System.out.println("med3(4, 7, 1): " + med3(4, 7, 1)); // 결과: 4
    }
}