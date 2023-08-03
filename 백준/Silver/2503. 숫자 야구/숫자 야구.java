
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
	    
	    boolean[] bool = new boolean[9*8*7];
	    int total = 0;

	    for(int i = 0; i<n; i++) {
	    	st = new StringTokenizer(br.readLine(), " ");
	    	String s = st.nextToken();
	    	int strike = Integer.parseInt(st.nextToken());
	    	int ball = Integer.parseInt(st.nextToken());
	    	int k = 0;
	    	for(int p = 1; p<10; p++) {
	    		for(int q=1; q<10; q++) {
	    			if(p==q) continue;
	    			for(int r=1; r<10; r++) {
	    				if(q==r || p==r) continue;
	    				if(bool[k++])continue;
	    				int cstrike = 0;
	    				int cball = 0;
	    				if((char)(p+'0') == s.charAt(0)) {
	    					cstrike++;
	    				}
	    				else if(s.contains(String.valueOf(p))){
	    					cball++;
	    				}
	    				if((char)(q+'0')==s.charAt(1)) {
	    					cstrike++;
	    				}
	    				else if(s.contains(String.valueOf(q))){
	    					cball++;
	    				}
	    				if((char)(r+'0')==s.charAt(2)) {
	    					cstrike++;
	    				}
	    				else if(s.contains(String.valueOf(r))){
	    					cball++;
	    				}
	    				if(cstrike!=strike || cball!=ball) {
	    					bool[k-1] = true;
	    				}
	    			}
	    		}
	    	}
	    }
	    
	    for(int i = 0; i<9*8*7; i++) {
	    	if(bool[i]==false) {
	    		total++;
	    	}
	    }
	   
	    bw.write(String.valueOf(total));
	    bw.flush();
	    bw.close();
	    br.close();
	}
	
}

