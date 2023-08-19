
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int w = Integer.parseInt(st.nextToken());
    	int h = Integer.parseInt(st.nextToken());
    	
    	st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken());
    	
    	int[][] arr = new int[n+1][2];
    	
    	//arr[n] => 동근이 위치
    	for(int i = 0; i<n+1; i++) {
    		st = new StringTokenizer(br.readLine());
    		int d = Integer.parseInt(st.nextToken());
    		switch(d){
    		case 1:
    			arr[i][0] = Integer.parseInt(st.nextToken());
    			arr[i][1] = 0;
    			break;
    		case 2:
    			arr[i][0] = Integer.parseInt(st.nextToken());
    			arr[i][1] = h;
    			break;
    		case 3:
    			arr[i][0] = 0;
    			arr[i][1] = Integer.parseInt(st.nextToken());
    			break;
    		case 4:
    			arr[i][0] = w;
    			arr[i][1] = Integer.parseInt(st.nextToken());
    			break;
    			
    		}
    	}
    	
    	int result = 0;
    	int total = 2*w+2*h;
    	
    	int x = arr[n][0];
    	int y = arr[n][1];
    	
    	
    	
    	for(int i = 0; i<n; i++) {
    		int sum = 0;
    		x = arr[n][0];
    		y = arr[n][1];
    		while(x != arr[i][0] || y != arr[i][1]) {
    			if(y == h) {
        			while(x > 0) {
        				x--;
        				sum++;
        				if(x == arr[i][0] && y == arr[i][1]) break;
        			}
    			}
    			if(y == 0) {
    				while(x < w) {
    					x++;
    					sum++;
    					if(x == arr[i][0] && y == arr[i][1]) break;
    				}
    			}
    			if(x == 0) {
    				while(y > 0) {
    					y--;
    					sum++;
    					if(x == arr[i][0] && y == arr[i][1]) break;
    				}
    			}
    			if(x == w) {
    				while(y < h) {
    					y++;
    					sum++;
    					if(x == arr[i][0] && y == arr[i][1]) break;
    				}
    			}
    		}
    		if(total - sum > sum) {
    			result += sum;
    		}
    		else {
    			result += total - sum;
    		}
    	}
    	
    	bw.write(String.valueOf(result));
    	bw.flush();


    }
}