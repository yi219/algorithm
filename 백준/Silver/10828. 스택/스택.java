
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
	    Stack<Integer> stack = new Stack<>();
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        Integer n = Integer.parseInt(st.nextToken());
	    
        //push X
        //pop
        //size
        //empty
        //top
        
	    for (int i = 0; i<n; i++) {
	    	st = new StringTokenizer(br.readLine()," ");
	    	String nt = st.nextToken();
	    	if(nt.equals("push")) {
	    		stack.add(Integer.parseInt(st.nextToken()));
	    	}
	    	else if(nt.equals("pop")) {
	    		if (stack.size() == 0) {
	    			System.out.println("-1");
	    		}
	    		else {
	    			System.out.println(stack.pop());
	    		}
	    	}
	    	else if(nt.equals("size")) {
	    		System.out.println(stack.size());
	    	}
	    	else if(nt.equals("empty")) {
	    		if(stack.empty()) {
	    			System.out.println("1");
	    		}
	    		else {
	    			System.out.println("0");
	    		}
	    	}
	    	else if(nt.equals("top")) {
	    		if (stack.size() == 0) {
	    			System.out.println("-1");
	    		}
	    		else {
	    			System.out.println(stack.peek());
	    		}
	    	}
	    }

	    
	    
	}
}
