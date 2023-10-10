
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static int d;
	static int result;
	static boolean finish = false;
	
	static int[] dx = {-1,0,+1,0};
	static int[] dy = {0,+1,0,-1};
	static int[][] arr;
	static boolean[][] visited;
	static int[][] direction = {{3,2,1,0},{0,3,2,1},{1,0,3,2},{2,1,0,3}};
	static int[] back = {2,3,0,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		result = 0;
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		visited = new boolean[N][M];
		int a = 0;
		for(int i = 0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 1) {
					visited[i][j] = true;
				}
			}
		}
//		System.out.println(a+"");
		
		search(R, C);
		bw.write(String.valueOf(result));
		bw.flush();
		
//		System.out.println();
//		for(int i=0; i<N; i++) {
//			for(int j=0; j<M; j++) {
//				if(visited[i][j]) System.out.print(1 + " ");
//				else System.out.print(0 + " ");
//			}
//			System.out.println();
//		}
	}
	
	public static void search(int r, int c) {
		if (!visited[r][c]) {
			visited[r][c] = true;
			result++;
		}
		
		boolean dirty = false;
		for (int dir : direction[d]) {
//			System.out.println(d + " " + dir);
			int x = r + dx[dir];
			int y = c + dy[dir];
			
			if(0 <= x && x < N && 0 <= y && y < M && arr[x][y] == 0) {
				if(visited[x][y] == false) {
					d = dir;
					dirty = true;
					search(x, y);
					if(finish) {
						return;
					}
					break;
				}
			}
		}
		if(!dirty) {
			int x = r+dx[back[d]];
			int y = c+dy[back[d]];
			if(0 <= x && x < N && 0 <= y && y < M && arr[x][y] == 0) {
				search(x, y);
				if(finish) {
					return;
				}
			}
			else if(0 <= x && x < N && 0 <= y && y < M && arr[x][y] == 1) {
				finish = true;
				return;
			}
		}
	}
}
