
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
    	int n = Integer.parseInt(st.nextToken());
    	int[][] arr = new int[100][100];
    	
    	int result = 0;
    	for(int i = 0; i<n; i++) {
    		st = new StringTokenizer(br.readLine());
    		int w = Integer.parseInt(st.nextToken());
    		int h = Integer.parseInt(st.nextToken());
    		
    		for(int aw = w; aw<w+10; aw++) {
    			for(int ah = h; ah<h+10; ah++) {
    				if(arr[aw][ah] != 1) {
    					arr[aw][ah] = 1;
    					result++;
    				}
    			}
    		}
    	}

    	bw.write(String.valueOf(result));
    	bw.flush();


    }
}