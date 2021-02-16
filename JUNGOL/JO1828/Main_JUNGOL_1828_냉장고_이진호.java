import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_JUNGOL_1828_냉장고_이진호 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] m = new int[N][2]; 
		int count = 1;
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			m[i][0] = Integer.parseInt(st.nextToken());
			m[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(m, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				int diff = Integer.compare(o1[0], o2[0]);
				return diff != 0 ? diff : o1[1] - o2[1];
			}
			
		});
		
		int point = m[0][1];
		for (int i = 0; i < m.length; i++) {
			if(m[i][0] <= point) {
				if(m[i][1] < point) {
					point = m[i][1];
				}
			}else {
				point = m[i][1];
				count++;
			}
			
		}
		System.out.println(count);
	}
}
