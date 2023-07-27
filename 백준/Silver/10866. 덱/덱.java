
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
	    Deque<Integer> queue = new ArrayDeque<>();
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Integer n = Integer.parseInt(st.nextToken());
        
	    for (int i = 0; i<n; i++) {
	    	st = new StringTokenizer(br.readLine()," ");
	    	String nt = st.nextToken();
	    	if(nt.equals("push_front")) {
	    		queue.addFirst(Integer.parseInt(st.nextToken()));
	    	}
	    	else if(nt.equals("push_back")) {
	    		queue.addLast(Integer.parseInt(st.nextToken()));
	    	}
	    	else if(nt.equals("size")) {
	    		bw.write(queue.size() + "\n");
	    	}
	    	else if(nt.equals("empty")) {
	    		if(queue.isEmpty()) {
	    			bw.write("1\n");
	    		}
	    		else {
	    			bw.write("0\n");
	    		}
	    	}
	    	else if(queue.isEmpty()) {
	    		bw.write("-1\n");
	    	}
	    	else if(nt.equals("pop_front")) {
	    		bw.write(queue.pollFirst() + "\n");
	    	}
	    	else if(nt.equals("pop_back")) {
	    		bw.write(queue.pollLast() + "\n");
	    	}
	    	else if(nt.equals("front")) {
	    		bw.write(queue.peekFirst() + "\n");
	    	}
	    	else if(nt.equals("back")) {
	    		bw.write(queue.peekLast() + "\n");
	    	}

	    }
	    bw.flush();
	    br.close();
	    bw.close();
	    
	}
}