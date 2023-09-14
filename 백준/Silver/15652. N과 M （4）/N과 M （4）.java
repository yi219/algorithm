import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
	static boolean[] numCount;
	static int n;
	static int m;
	static StringBuilder sb;
    static int[] answerArray;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		sb = new StringBuilder();
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
        answerArray = new int[m];
		numCount = new boolean[n];
		
		nKWAm(0,0);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}
	
	public static void nKWAm(int depth, int startindex) {
        if(depth == m){
            for(int e : answerArray){
                sb.append(e + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i = startindex;i<numCount.length;i++){
            numCount[i] = true;
            answerArray[depth] = i+1;
            nKWAm(depth+1,i);
        }
	}
}
