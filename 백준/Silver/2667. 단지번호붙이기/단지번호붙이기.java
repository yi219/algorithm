
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = null;
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	    st = new StringTokenizer(br.readLine());
	    int n = Integer.parseInt(st.nextToken());

	    int[][] arr = new int[n][n];
	    for(int i = 0; i<n; i++) {
	        st = new StringTokenizer(br.readLine());
	        String str = st.nextToken();
	        for(int j = 0; j<n; j++) {
	            arr[i][j] = (int) str.charAt(j) - '0';
	        }
	    }
	    
	    ArrayList<Integer> result = new ArrayList<>();
	    int num = 0;

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                if(arr[i][j] == 1) {
                	num++;
                    result.add(search(i, j, arr));
                }
            }
        }

        Collections.sort(result);
        
	    bw.write(num+"\n");
	    for(int i = 0; i<result.size(); i++) {
	    	bw.write(result.get(i)+"\n");
	    }
	    bw.flush();
	}

	public static int search(int i, int j, int[][] arr) {
		int sum = 0;
	    if(arr[i][j] == 1) {
	        arr[i][j] = 0;
	        sum++;
	        if(i==0 && j==0) {
	            sum += search(i+1, j, arr);
	            sum += search(i, j+1, arr);
	        }
	        else if(i==arr.length-1 && j==arr.length-1) {
	        	sum += search(i-1, j, arr);
	        	sum += search(i, j-1, arr);
	        }
	        else if(i==0 && j==arr.length-1) {
	        	sum += search(i+1, j, arr);
	        	sum += search(i, j-1, arr);
	        }
	        else if(i==arr.length-1 && j==0) {
	        	sum +=  search(i, j+1, arr);
	        	sum += search(i-1, j, arr);
	        }
	        else if(i==0) {
	        	sum += search(i+1, j, arr);
	        	sum += search(i, j+1, arr);
	            sum += search(i, j-1, arr);
	        }
	        else if(i==arr.length-1) {
	        	sum += search(i-1, j, arr);
	        	sum += search(i, j+1, arr);
	        	sum += search(i, j-1, arr);
	        }
	        else if(j==0) {
	        	sum += search(i+1, j, arr);
	        	sum += search(i-1, j, arr);
	        	sum += search(i, j+1, arr);
	        }
	        else if(j==arr.length-1) {
	        	sum += search(i+1, j, arr);
	        	sum += search(i-1, j, arr);
	        	sum += search(i, j-1, arr);
	        }
	        else {
	        	sum += search(i+1, j, arr);
	        	sum += search(i-1, j, arr);
	        	sum += search(i, j+1, arr);
	            sum += search(i, j-1, arr);
	        }
	    }
	    return sum;
	    
	}

}
