
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
	static int[][] arr;
	static int m;
	static int n;
	static int cheese = 0;
	static int ch = 0;
	static int time = 0;
	static boolean[][] visited;
	
	static class Node {
		int x;
		int y;
		public Node(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
	}
	
	static Queue<Node> queue = new ArrayDeque<>();
	
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	    m = Integer.parseInt(st.nextToken());
	    n = Integer.parseInt(st.nextToken());
	    
	    arr = new int[m][n];
	    
	    for(int i = 0; i<m; i++) {
	    	st = new StringTokenizer(br.readLine());
	    	for(int j = 0; j<n; j++) {
	    		arr[i][j] = Integer.parseInt(st.nextToken());
	    		if (arr[i][j] == 1) cheese++;
	    	}
	    }
	    

	    while(cheese > 0) {
	    	ch = 0;
	    	visited = new boolean[m][n];
	    	visited[0][0] = true;
	    	queue.add(new Node(0,0));
		    while(!queue.isEmpty()) {
		    	search(queue.poll());
		    }
		    time++;
		    cheese -= ch;
	    }


	    bw.write(time+"\n"+ch);

	    
	    bw.flush();
	}
	
	public static void search(Node node) {
		for(int i = 0; i<4; i++) {
			int xx = node.x+dx[i];
			int yy = node.y+dy[i];
			
			if(0 <= xx && xx <m && 0 <= yy && yy < n && !visited[xx][yy]) {
				visited[xx][yy] = true;
				//치즈인 경우
				if (arr[xx][yy] == 1) {
					arr[xx][yy] = 0;
					ch++;
				}
				//공기인 경우
				else {
					queue.add(new Node(xx, yy));
				}
			}
		}
	}
	

}
