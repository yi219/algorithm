
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static String[] arr;
	static int m;
	static int n;
	static int[][] visited;

	
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	    n = Integer.parseInt(st.nextToken());
	    m = Integer.parseInt(st.nextToken());
	    
	    arr = new String[n];
	    
	    for(int i = 0; i<n; i++) {
	    	st = new StringTokenizer(br.readLine());
	    	arr[i] = st.nextToken().toString();
	    }
	    
	    
	    visited = new int[n][m];

	    for (int i = 0; i<n; i++) {
	    	for (int j = 0; j<m; j++) {
	    		visited[i][j] = Integer.MAX_VALUE;
	    	}
	    }

	    search(0,0,1);
	    
	    bw.write(Integer.toString(visited[n-1][m-1]));	    
	    bw.flush();
	}
	
	public static void search(int x, int y, int depth) {
		for(int i = 0; i<4; i++) {
			int xx = x+dx[i];
			int yy = y+dy[i];
			
			if(0 <= xx && xx <n && 0 <= yy && yy < m) {
				if (arr[xx].charAt(yy) != '0') {
					if (visited[xx][yy] > depth+1) {
						visited[xx][yy] = depth+1;
						search(xx, yy, depth+1);
					}	
				}
			}
		}
	}
	

}
