import java.util.Scanner;

/**
 * 519 연산자 - 자가진단2
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		20 35
		int a = sc.nextInt(); // 20
		int b = sc.nextInt(); // 35
		a += 100;
		b %= 10;
		System.out.println(a + " " + b);
	}
}
