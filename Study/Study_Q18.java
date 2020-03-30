package Study;
import java.util.Random;

public class Study_Q18 {

	// 배열 a의 최댓값을 구하여 반환
	public static int maxOf(final int[] a) {
      int max = a[0];
      for (int i = 1; i < a.length; i++)
         if (a[i] > max)
            max = a[i];
      return max;
   }

	public static void main(final String[] args) {
      final Random rand = new Random();

      System.out.println("키의 최댓값을 구합니다.");
      final int num = rand.nextInt(20);      // 사람 수를 1~20의 랜덤으로 생성
      final int height[] = new int[num];     // 랜덤으로 생성된 num의 수만큼 배열을 생성

      System.out.println("사람수: " + num);
      System.out.println("키 값은 아래와 같습니다.");
      for (int i = 0; i < num; i++) {
         height[i] = 100 + rand.nextInt(90);      // 키 값을 랜덤으로 결정
         System.out.println("height[" + i + "]：" + height[i]);
      }

      System.out.println("최댓값은 " + maxOf(height) + "입니다.");
   }
}
