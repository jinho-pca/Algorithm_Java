import java.util.Scanner;

/**
 * 556 : 배열1 - 자가진단2
 * 정수 10 개를 저장할 수 있는 배열을 만들어서 1 부터 10 까지를 대입하고 차례대로 출력하는 프로그램을 작성하시오.
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 1; i <= 10; i++) {
			a[i-1] = i;
		}
		
//		커서가 아랫줄에 있다
		String result = "";
		for (int i = 0; i < a.length; i++) {
			result += a[i] + " ";
		}
		System.out.println(result);
		
//		for (int num : a) {
//			System.out.print(num + " ");
//		}
		
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}
	}
}
