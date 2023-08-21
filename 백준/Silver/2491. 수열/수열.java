
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	    int n = Integer.parseInt(st.nextToken());
	    st = new StringTokenizer(br.readLine());

	    int prev = Integer.parseInt(st.nextToken());
	    
	    int d = 0;
	    int max = 1;
	    int count = 1;
	    int same = 1;
	    for(int i = 0; i<n-1; i++) {
	    	int next = Integer.parseInt(st.nextToken());
	    	if(prev == next) {
	    		same++;
	    		count++;
	    	}
	    	else if(prev < next) {
	    		if(d==1) {
	    			count++;
	    		}
	    		else if(d==-1) {
	    			if(max < count) max=count;
	    			count = same+1;
	    			d = 1;
	    		}
	    		else {
	    			d=1;
	    			count++;
	    		}
	    		same = 1;
	    	}
	    	else if(prev > next) {
	    		if(d==-1) {
	    			count++;
	    		}
	    		else if(d==1) {
	    			if(max < count) max = count;
	    			count = same+1;
	    			d = -1;
	    		}
	    		else {
	    			count++;
	    			d = -1;
	    		}
	    		same = 1;
	    	}
	    	if(max < count) max = count;
	    	prev = next;

	    }
	    bw.write(max+"");
	    bw.flush();
	}
}
