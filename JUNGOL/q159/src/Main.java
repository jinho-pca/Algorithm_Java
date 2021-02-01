import java.util.Arrays;
import java.util.Scanner;

/**
 * 159 : 배열1 - 형성평가A
 * 20 이하의 정수 n을 입력받고 n명의 점수를 입력받아 높은 점수부터 차례로 출력하는 프로그램을 작성하시오.
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
//		배열의 내용을 쉽게 관리할 수 있도록 만든 메서드를 제공하는 클래스
		Arrays.sort(a); // 배열의 원소를 정렬하는 메서드
//		System.out.println(Arrays.toString(a)); // [10, 35, 35, 64, 100]
		for(int i = a.length-1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}
}


/* 
 * 정렬
 * 선택정렬, 버블정렬, 삽입정렬 : 시간복잡도가 느리다.
 * 머지정렬, 퀵정렬(보통 많이 쓰인다. 하지만 최악에는 안좋다.), 힙정렬, 쉘정렬 :  위에보단 빠르지만 구현하기는 위에보다 힘들다.
 * 카운팅정렬 : 가장 빠르다(메모리를 사용한다.)
 * */