

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
    	
    	for(int i = 0; i<n ; i++) {
    		int[] a = new int[5];
    		st = new StringTokenizer(br.readLine());
    		int an = Integer.parseInt(st.nextToken());
    		for(int l = 0; l<an; l++) {
    			a[Integer.parseInt(st.nextToken())]++;
    		}
    		int[] b = new int[5];
    		st = new StringTokenizer(br.readLine());
    		int bn = Integer.parseInt(st.nextToken());
    		for(int l = 0; l<bn; l++) {
    			b[Integer.parseInt(st.nextToken())]++;
    		}
    		
    		int k = 4;
    		for(k = 4; k>0; k--) {
    			if(a[k]>b[k]) {
    				bw.write("A\n");
    				break;
    			}
    			else if(a[k]<b[k]) {
    				bw.write("B\n");
    				break;
    			}
    		}
    		if(k == 0) {
    			bw.write("D\n");
    		}
    	}
    	
    	bw.flush();


    }
}