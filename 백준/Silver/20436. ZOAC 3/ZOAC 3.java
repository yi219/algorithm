import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] qwerty = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        
        String left = st.nextToken();
        String right = st.nextToken();

        int[] l = new int[2];
        for(int i = 0; i<3; i++) {
            if(qwerty[i].contains(left)) {
                l[0] = i;
                l[1] = qwerty[i].indexOf(left);
                break;
            }
        }
        int[] r = new int[2];
        for(int i = 0; i<3; i++) {
            if(qwerty[i].contains(right)) {
                r[0] = i;
                r[1] = qwerty[i].indexOf(right);
                break;
            }
        }
        
        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        
        int result = 0;
        result += str.length();    //누르는 시간
        
        for(int i = 0; i<str.length(); i++) {
            char a = str.charAt(i);
            for(int j = 0; j<3; j++) {
                if(qwerty[j].contains(a+"")) {
                    int index = qwerty[j].indexOf(a);
                    switch(j) {
                    case 2:
                        if(index < 4) {
                            result += Math.abs(l[0]-j) + Math.abs(l[1]-index);
                            l[0] = j;
                            l[1] = index;
                            
                        }else {
                            result += Math.abs(r[0]-j) + Math.abs(r[1]-index);
                            r[0] = j;
                            r[1] = index;
                        }
                        break;
                    default:
                        if(index < 5) {
                            result += Math.abs(l[0]-j) + Math.abs(l[1]-index);
                            l[0] = j;
                            l[1] = index;
                        }else {
                            result += Math.abs(r[0]-j) + Math.abs(r[1]-index);
                            r[0] = j;
                            r[1] = index;
                        }
                    }
                }
            }
            
        }
        
        bw.write(Integer.toString(result));
        bw.flush();

    }
}