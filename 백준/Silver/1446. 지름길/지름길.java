import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static ArrayList<Node>[] edgeList;
	static int[] dist;

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());

		edgeList = new ArrayList[d + 1];
		dist = new int[d+1];

		for (int i = 0; i <= d; i++) {
			edgeList[i] = new ArrayList<>();
		}
		
		PriorityQueue<Node> queue = new PriorityQueue<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			if(end > d) {
				continue;
			}
			edgeList[start].add(new Node(end, cost));
		}
		for (int i = 0; i <= d; i++) {
			dist[i] = i;
			queue.add(new Node(i,dist[i]));
		}
		queue.add(new Node(0,0));

		while (!queue.isEmpty()) {
			Node cur = queue.poll();
			for(Node next : edgeList[cur.num]) {
				if (dist[cur.num] + next.cost < dist[next.num]) {
					dist[next.num] = dist[cur.num] + next.cost;
					queue.add(new Node(next.num, dist[next.num]));
					for (int i = next.num + 1; i <= d; i++) {
						if(dist[i] > dist[i-1] + 1) {
							dist[i] = dist[i - 1] + 1;
							queue.add(new Node(i,dist[i]));
						}
					}
				}
			}
			
		}
		
		System.out.println(dist[d]);

	}

}

class Node implements Comparable<Node> {
	int num, cost;

	Node(int num, int cost) {
		this.num = num;
		this.cost = cost;
	}

	public int compareTo(Node other) {
		return Integer.compare(this.cost, other.cost);
	}
}