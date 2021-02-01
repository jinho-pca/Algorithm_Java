import java.util.Scanner;

/**
 * 523 연산자 - 자가진단6
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result1 = a > b ? 1 : 0;
		int result2 = a < b ? 1 : 0;
		int result3 = a >= b ? 1 : 0;
		int result4 = a <= b ? 1 : 0;
		System.out.println(a + " > " + b + " --- " + result1);
		System.out.println(a + " < " + b + " --- " + result2);
		System.out.println(a + " >= " + b + " --- " + result3);
		System.out.println(a + " <= " + b + " --- " + result4);
		
	}
}