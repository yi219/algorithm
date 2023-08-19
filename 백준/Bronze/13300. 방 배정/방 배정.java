
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
    	int k = Integer.parseInt(st.nextToken());
    	
    	int[] gradeW = new int[7];
    	int[] gradeM = new int[7];
    	
    	int result = 0;
    	
    	for(int i = 0; i<n; i++) {
    		st = new StringTokenizer(br.readLine());
    		int s = Integer.parseInt(st.nextToken());
    		int y = Integer.parseInt(st.nextToken());
    		
    		//여학생
    		if(s==0) {
    			if(gradeW[y]==0) {
    				result++;
    				gradeW[y]+=1;
    			}
    			else if(gradeW[y]==k-1) {
    				gradeW[y]=0;
    			}
    			else {
    				gradeW[y]+=1;
    			}
    		}
    		//남학생
    		else {
    			if(gradeM[y]==0) {
    				result++;
    				gradeM[y]+=1;
    			}
    			else if(gradeM[y]==k-1) {
    				gradeM[y]=0;
    			}
    			else {
    				gradeM[y]+=1;
    			}
    		}
    	}
    	
    	bw.write(String.valueOf(result));
    	bw.flush();


    }
}