package Silver2;

import java.io.*;
import java.util.Optional;
import java.util.PriorityQueue;

public class s1927 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		PriorityQueue pq = new PriorityQueue<Integer>();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			int x = Integer.parseInt(bf.readLine());
			if(x==0) {
				Optional p = Optional.ofNullable(pq.poll());
				sb.append(p.orElse(0)+"\n");
			}
			else 
				pq.add(x);
		}
		System.out.print(sb);
	}

}
