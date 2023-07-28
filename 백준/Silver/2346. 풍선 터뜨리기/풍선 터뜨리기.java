import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Integer n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        
        Deque<Integer> ball = new ArrayDeque<>();
        ArrayList<Integer> gap = new ArrayList<>();

        for(int i=0; i<n; i++) {
        	ball.add(i+1);
        	gap.add(Integer.parseInt(st.nextToken()));
        }

       
        
        for (int i = 0; i<n-1; i++) {
        	Integer num = gap.get(ball.peek()-1);
        	bw.write(ball.poll()+" ");
        	if (num<0) {
        		for(; num < 0; num++) {
        			ball.addFirst(ball.pollLast());
        		}
        	}
        	else {
        		for(; num > 1; num--) {
        			ball.addLast(ball.pollFirst());
        		}
        	
        	}
        }
        bw.write(ball.poll()+" ");
        
	    bw.flush();
	    br.close();
	    bw.close();
	    
	}
}