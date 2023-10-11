import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	static class Node{
		int x;
		int y;
		public Node(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
	}
	
	static int N;
	static int[][] arr;
	static int[][] visited;
	static int time;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int e0;
	static int e1;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		for(int t = 1; t<=T; t++) {
			time = Integer.MAX_VALUE;
			
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			arr = new int[N][N];
			visited = new int[N][N];
			
			for(int i = 0; i<N; i++) {
				Arrays.fill(visited[i], Integer.MAX_VALUE);
			}
			
			for(int i = 0; i<N; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j<N; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			st = new StringTokenizer(br.readLine());
			int s0 = Integer.parseInt(st.nextToken());
			int s1 = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			e0 = Integer.parseInt(st.nextToken());
			e1 = Integer.parseInt(st.nextToken());
			
			search(s0, s1, 0);
			if (visited[e0][e1] == Integer.MAX_VALUE) {
				time = -1;
			}else {
				time = visited[e0][e1];
			}
			bw.write("#"+t+" "+time+"\n");
		}
		bw.flush();
	}
	
	public static void search(int x, int y, int depth) {
		visited[x][y] = depth;
		//if(time < depth) return;
		
		if(x == e0 && y == e1) {
			//if(time > depth) time = depth;
			return;
		}

		for(int i = 0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(0<=nx && nx<N && 0<=ny && ny<N) {
				//섬이 아닐 때
				if(arr[nx][ny] != 1) {
					//소용돌이를 기다리는 경우
					if(arr[nx][ny] == 2) {
						if(depth%3 == 0 && visited[nx][ny] > depth+3) {
							search(nx,ny,depth+3);
						}else if(depth%3 == 1 && visited[nx][ny] > depth+2) {
							search(nx,ny,depth+2);
						}else if(depth%3 == 2 && visited[nx][ny] > depth+1){
							search(nx,ny,depth+1);
						}
					}
					else {
						if(visited[nx][ny] > depth+1) {
							search(nx, ny, depth+1);
						}					
					}
				}
			}
		}
	}
	
}
