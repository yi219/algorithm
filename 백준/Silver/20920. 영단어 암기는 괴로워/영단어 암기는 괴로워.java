

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			if(s.length() >= m) {
				if(map.get(s) == null) {
					map.put(s, 1);
				}
				else {
					map.put(s, map.get(s)+1);	
				}
			}
		}
		
		List<String> keySet = new ArrayList<>(map.keySet());
		
		keySet.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(map.get(o1) > map.get(o2)) return -1;
				else if(map.get(o1) == map.get(o2)) {
					if(o1.length()>o2.length()) return -1;
					else if(o1.length() == o2.length()) {
						if(o1.compareTo(o2) < 0) {
							return -1;
						}
						else if(o1.compareTo(o2) > 0) {
							return 1;
						}
						else {
							return 0;
						}
					}
					else return 1;
				}
				else {
					return 1;
				}
			}
			
		});
		

		StringBuilder sb = new StringBuilder();
		for(String key:keySet) {
			sb.append(key).append("\n");
		}
		
		bw.write(sb.toString());


		bw.flush();
	
	}
}