
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine()," ");
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	    Integer n = Integer.parseInt(st.nextToken());
	    Integer m = Integer.parseInt(st.nextToken());
	    
	    boolean[][] list = new boolean[201][201];
	    for(int i = 0; i<m; i++) {
	    	st = new StringTokenizer(br.readLine(), " ");
	    	int p = Integer.parseInt(st.nextToken());
	    	int q = Integer.parseInt(st.nextToken());
	    	list[p][q] = true;
	    	list[q][p] = true;
	    }
	    
	    int total = 0;
	    
	    for(int i = 1; i<n-1; i++) {
	    	for(int j=i+1; j<n; j++) {
	    		if(!list[i][j]) {
		    		for(int k = j+1; k<n+1; k++) {
		    			if(!list[i][k] && !list[j][k]) {
		    				total++;
		    			}
		    		}
	    		}

	    	}
	    }
	    
	    bw.write(String.valueOf(total));
	    bw.flush();
	    bw.close();
	    br.close();
	}
	
}

