import java.io.*;
import java.util.*;

public class Main {
	static int n, m;

	static class Node {
		int v, idx;

		public Node(int v, int idx) {
			super();
			this.v = v;
			this.idx = idx;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		int arr[] = new int[n + 1];
		int arr2[] = new int[n + 1];
		st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Stack<Node> s = new Stack();
		for (int i = n; i > 0; i--) {
			if (!s.isEmpty()) {
				while (!s.isEmpty() && s.peek().v < arr[i]) {
					Node cur = s.pop();
					arr2[cur.idx] = i;
				}
			}
			s.push(new Node(arr[i], i));
		}

		while (!s.isEmpty()) {
			Node cur = s.pop();
			arr2[cur.idx] = 0;
		}

		for (int i = 1; i <= n; i++) {
			sb.append(arr2[i] + " ");
		}
		
		System.out.println(sb.toString());
	}

}
