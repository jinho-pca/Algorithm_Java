import java.util.Scanner;

/**
 * 525 연산자 - 자가진단8
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.print(a > b && a > c ? 1 : 0 );
		System.out.print(" ");
		System.out.print(a == b && a == c ? 1 : 0);
	}
}   