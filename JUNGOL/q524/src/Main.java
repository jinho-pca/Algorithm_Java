import java.util.Scanner;

/**
 * 524 연산자 - 자가진단7
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean c = (a != 0);
		boolean d = (b != 0);
		System.out.print(c && d);
		System.out.print(" ");
		System.out.print(c || d);
	}
}