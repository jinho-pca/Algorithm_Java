import java.util.Scanner;

/**
 * 120 : 선택제어문 - 형성평가1
 * 두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 차를 출력하는 프로그램을 작성하시오.
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		50 85
		int a = sc.nextInt(); // 50
		int b = sc.nextInt(); // 85
//		System.out.println(a > b ? a - b : b - a); // 내 코드
		
//		if(a > b) {
//			System.out.println(a - b);
//		} else {
//			System.out.println(b - a);
//		}
		
		System.out.println(Math.abs(a - b));
	}
}   