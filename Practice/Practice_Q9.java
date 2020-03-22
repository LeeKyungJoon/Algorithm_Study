package Practice;


public class Practice_Q9 {
    
        
        static int sumof(int a, int b){
            int t = a;
            int n = b;
            int sum = 0;

            if( a > b) {
                t = b;
                n = a;
            }
            for(int i = t; i <= n; i++){
                sum += i;
            }
            return sum;
        }

        public static void main(String[] args) {
            System.out.println("min3(3, 5): " + sumof(3, 5));
            System.out.println("min3(6, 4): " + sumof(6, 4));
        }
    
}