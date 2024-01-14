import java.io.*;
import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add(Long.parseLong(br.readLine()));
        }

        long sum = 0;
        while(pq.size() != 1) {
            long p1 = pq.poll();
            long p2 = pq.poll();

            sum += (p1 + p2);
            pq.add(p1 + p2);
        }

        System.out.println(sum);
    }
}
