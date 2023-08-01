
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Integer t = Integer.parseInt(st.nextToken());
        
    	int[] rArr = {1,2,3};
    	boolean[] rVisited = new boolean[3];
    	ArrayList<ArrayList> comThree = new ArrayList<ArrayList>();
    	for(int z=1; z<=3;z++) {
    		combination(rArr, rVisited, 0, 3, z, comThree);
    	}
    	ArrayList<Integer> zero = new ArrayList<Integer>();
    	zero.add(0);
    	comThree.add(zero);
    	
    	int[] crArr = {1,2};
    	boolean[] crVisited = new boolean[2];
    	ArrayList<ArrayList> comTwo = new ArrayList<ArrayList>();
    	for(int z=1; z<=2;z++) {
    		combination(crArr, crVisited, 0, 2, z, comTwo);
    	}
    	comTwo.add(zero);
        
        for(int i = 0; i<t; i++) {
        	//t번 실행
        	String[] coin = new String[9];

        	//3행 3열 입력 받기
        	int k = 0;
        	for(int r = 0; r<3; r++) {
            	st = new StringTokenizer(br.readLine()," ");
            	for(int c = 0; c<3; c++) {
            		coin[k] = new String(st.nextToken());
            		k++;
            	}
        	}
        	
        	Integer min = 100;
        	for (ArrayList<Integer> c:comThree) {
        		for(ArrayList<Integer> r:comThree) {
        			for(ArrayList<Integer> cr:comTwo) {
        				String[] copyCoin = coin.clone();
        				int resultC = flip(c,r,cr,copyCoin);
        				String[] arr = Arrays.stream(copyCoin).distinct().toArray(String[]::new);
        				//System.out.println(Arrays.toString(arr));
        				if(arr.length == 1 && resultC < min) {
        					min = resultC;
        				}
        			}
        		}
        	}
        	
        	if(min == 100) {
        		bw.write("-1\n");
        	}
        	else {
        		bw.write(min.toString()+"\n");
        	}
        	
        }

        //bw.write("");
        
	    bw.flush();
	    br.close();
	    bw.close();
	}
	
	public static int flip(ArrayList<Integer> r, ArrayList<Integer> c, ArrayList<Integer> cross, String[] coin) {
		int count = 0;
		for (Integer rr:r) {
			switch(rr) {
			case 1:
				coin[0] = ht(coin[0]);
				coin[1] = ht(coin[1]);
				coin[2] = ht(coin[2]);
				count++;
				break;
			case 2:
				coin[3] = ht(coin[3]);
				coin[4] = ht(coin[4]);
				coin[5] = ht(coin[5]);
				count++;
				break;
			case 3:
				coin[6] = ht(coin[6]);
				coin[7] = ht(coin[7]);
				coin[8] = ht(coin[8]);
				count++;
				break;			
		}
		}
		for(Integer cc:c) {
		switch(cc) {
			case 1:
				coin[0] = ht(coin[0]);
				coin[3] = ht(coin[3]);
				coin[6] = ht(coin[6]);
				count++;
				break;
			case 2:
				coin[1] = ht(coin[1]);
				coin[4] = ht(coin[4]);
				coin[7] = ht(coin[7]);
				count++;
				break;
			case 3:
				coin[2] = ht(coin[2]);
				coin[5] = ht(coin[5]);
				coin[8] = ht(coin[8]);
				count++;
				break;			
		}
		}
		for(Integer cro:cross) {
		switch(cro) {
			case 1:
				coin[0] = ht(coin[0]);
				coin[4] = ht(coin[4]);
				coin[8] = ht(coin[8]);
				count++;
				break;
			case 2:
				coin[2] = ht(coin[2]);
				coin[4] = ht(coin[4]);
				coin[6] = ht(coin[6]);
				count++;
				break;		
		}
		}
		return count;
			
	}
	public static String ht(String c) {
		if(c.equals("H")) {
			return (new String("T"));
		}
		else {
			return (new String("H"));
		}
	}
	public static void combination(int[] arr, boolean[] visited, int start, int n, int r, ArrayList<ArrayList> result) {
		ArrayList<Integer> intarr = new ArrayList<Integer>();
		if(r == 0) {
			for(int i = 0; i<n; i++) {
				if(visited[i]) {
					intarr.add(arr[i]);
				}
			}
			result.add(intarr);
			return;
		}
		for(int i=start; i<n; i++) {
			visited[i] = true;
			combination(arr, visited, i+1, n, r-1, result);
			visited[i] = false;
		}
	}
}