package Study;


public class Study_Q9 {
    
        // 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드를 작성하세요.
        static int sumof(int a, int b){
            int start = a; // 반복문의 시작
            int end = b; // 반복문의 끝
            int sum = 0; // 최종결과를 가져올 변수

            if( a > b) { // 첫 시작이 끝보다 클 경우 각각의 변수의 값들을 서로 바꿈
                start = b;
                end = a;
            }
            for(int i = start; i <= end; i++){ // start부터 end까지 반복문 실행
                sum += i; // 변수 sum에 i를 더한 뒤 다시 변수 sum에 대입
            }

            return sum; // 최종 sum의 값을 return
        }

        public static void main(String[] args) {
            System.out.println("min3(3, 5): " + sumof(3, 5)); // 결과: 12
            System.out.println("min3(6, 4): " + sumof(6, 4)); // 결과: 15
        }
    
}