import java.util.Scanner;

public class Solution_1954 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
       
        for(int testCase = 1; testCase <= T; testCase++) {
        	int N = sc.nextInt();
        	int[][] snail = new int[N][N];
        	int cnt = 1;
        	int left = 0;
        	int right = N-1;
        	int top = 0;
        	int bottom = N-1;
        	while(cnt <= N*N) {
        		// 우측방향
        		for(int i = top; i <= bottom; i++) {
        			snail[left][i] = cnt++;
        		}
        		left++;
        		// 아래방향
        		for(int i = left; i <= right; i++) {
        			snail[i][bottom] = cnt++;
        		}
        		bottom--;
        		// 좌측방향
        		for(int i = bottom; i >= top; i--) {
        			snail[right][i] = cnt++;
        		}
        		right--;
        		// 위쪽방향
        		for(int i = right; i >= left; i--) {
        			snail[i][top] = cnt++;
        		}
        		top++;
        	}
        	System.out.println("#" + testCase);
        	for(int i = 0; i < N; i++) {
        		for(int j = 0; j < N; j++) {
        			System.out.print(snail[i][j] + " ");
        		}
        		System.out.println();
        	}
        }
        



    } // end of main
} // end of class
