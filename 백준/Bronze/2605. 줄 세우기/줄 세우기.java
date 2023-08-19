
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken());
    	
    	st = new StringTokenizer(br.readLine());
    	
    	ArrayList<Integer> arr = new ArrayList<>();
    	
    	st.nextToken();
    	arr.add(1);
    	
    	for(int i = 2; i<n+1; i++) {
    		int k = Integer.parseInt(st.nextToken());
    		arr.add(arr.size()-k, i);
    	}
    	
    	for(int i = 0; i<n; i++) {
    		bw.write(arr.get(i)+" ");
    	}
    	
    	bw.flush();


    }
}