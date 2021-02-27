import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
public class Solution_SWEA_1247_최적경로_D5_이진호 {
    static int N;
	static int cnt;
	static int result;
	static int[][] dis;
	static boolean[][] visited;
	static Point[] p;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());

		for (int testCase = 1; testCase <= TC; testCase++) {
			N = Integer.parseInt(br.readLine());
			dis = new int[N+2][N+2];
			visited = new boolean[N+2][N+2];
			p = new Point[N+2];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int i = 0; i < N+2; i++) { // 좌표 입력받아서 객체배열에 저장
				p[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			}
			for(int i = 0; i < N+2; i++) { // 좌표배열원소간 거리배열에 값 입력하기
				for(int j = i+1; j < N+2; j++) {
					dis[i][j] = dis[j][i] = Math.abs(p[i].x - p[j].x) + Math.abs(p[i].y - p[j].y); 
				}
			}
			minSearch(0);
			System.out.println(result);
			
		} // end of for testCase
	} // end of main
	static class Point{
		int x;
		int y;
		public Point() {}
		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
	}
	private static void minSearch(int start) {
		if(cnt == N+1) return;
		int min = Integer.MAX_VALUE;
		for(int i = 1; i < dis.length - 1; i++) {
			if(min > dis[start][i] && visited[start][i] == false) {
				min = dis[start][i];
			}
		}
		result += dis[start][min];
		visited[start][min] = true;
		minSearch(min);
		cnt++;
	}
}
