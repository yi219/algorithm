
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
	    Queue<Integer> queue = new LinkedList<>();
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Integer n = Integer.parseInt(st.nextToken());

        Integer last = null;
        
	    for (int i = 0; i<n; i++) {
	    	st = new StringTokenizer(br.readLine()," ");
	    	String nt = st.nextToken();
	    	if(nt.equals("push")) {
	    		last = Integer.parseInt(st.nextToken());
	    		queue.add(last);
	    	}
	    	else if(nt.equals("size")) {
	    		bw.write(queue.size()+"\n");
	    		//System.out.println(queue.size());
	    	}
	    	else if(nt.equals("empty")) {
	    		if(queue.isEmpty()) {
	    			bw.write("1\n");
	    			//System.out.println("1");
	    		}
	    		else {
	    			bw.write("0\n");
	    			//System.out.println("0");
	    		}
	    	}
	    	else if(queue.isEmpty()) {
	    		bw.write("-1\n");
	    		//System.out.println("-1");
	    	}
	    	else if(nt.equals("pop")) {
	    		bw.write(queue.poll() + "\n");
	    		//System.out.println(queue.poll());
	    	}

	    	else if(nt.equals("front")) {
	    		bw.write(queue.peek() + "\n");
	    		//System.out.println(queue.peek());
	    	}
	    	else if(nt.equals("back")) {
	    		bw.write(last + "\n");
	    		//System.out.println(last);
	    	}
	    }
	    bw.flush();
	    br.close();
	    bw.close();
	    
	}
}