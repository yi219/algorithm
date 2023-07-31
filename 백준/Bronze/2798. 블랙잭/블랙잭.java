
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Integer n = Integer.parseInt(st.nextToken());
        Integer m = Integer.parseInt(st.nextToken());
        ArrayList<Integer> num = new ArrayList<>();
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<n ; i++) {
        	num.add(Integer.parseInt(st.nextToken()));
        }
        
        Integer com = 0;
        
        for(int i = 0; i<n; i++) {
        	for (int j = 0; j<n ; j++) {
        		for(int k = 0; k<n; k++) {
        			if(i != j && j!=k && i!=k) {
            			Integer r = num.get(i)+num.get(j)+num.get(k);
            			if(r>=com && r<=m) {
            				com = r;
            			}
        			}
        		}
        	}
        }
        bw.write(com.toString());
        
	    bw.flush();
	    br.close();
	    bw.close();
	}
}