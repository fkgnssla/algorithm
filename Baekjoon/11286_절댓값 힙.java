package Silver1;

import java.io.*;
import java.util.Comparator;
import java.util.Optional;
import java.util.PriorityQueue;

public class s11286 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		StringBuilder sb = new StringBuilder();
		PriorityQueue pq = new PriorityQueue(
				new Comparator<Integer>() {
					@Override
					public int compare(Integer o1, Integer o2) {
						int a = Math.abs(o1);
						int b = Math.abs(o2);
						
						if(a==b) {
							return o1-o2;
						}
						return a-b;
					}
				});
		
		for(int i=0;i<n;i++) {
			int x = Integer.parseInt(bf.readLine());
			if(x==0) {
				Optional op = Optional.ofNullable(pq.poll());
				sb.append(op.orElse(0)+"\n");
			}
			else
				pq.add(x);
		}
		
		System.out.print(sb);
	}
}
