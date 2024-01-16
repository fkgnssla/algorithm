import java.util.*;
import java.io.*;

class Main {
    static ArrayList<ArrayList<Node>> g = new ArrayList();
    static int dist[]; // 최단 거리
    static int v, e, k;

    static class Node implements Comparable<Node> {
        int end, weight;

        public Node(int end, int weight) {
            this.end = end;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return weight - o.weight;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(br.readLine());

        dist = new int[v + 1];
        visited = new boolean[v + 1];
        for (int i = 0; i <= v; i++) {
            g.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            g.get(s).add(new Node(e, w));
        }

        dijkstra(k);
        for (int i = 1; i <= v; i++) {
            if (dist[i] == Integer.MAX_VALUE) System.out.println("INF");
            else System.out.println(dist[i]);
        }
    }

    static boolean visited[];
    static void dijkstra(int start) {
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(visited, false);

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int cur = node.end;

            if (!visited[cur]) {
                visited[cur] = true;

                for (Node next : g.get(cur)) {
                    if (!visited[next.end] && dist[next.end] > dist[cur] + next.weight) {
                        dist[next.end] = dist[cur] + next.weight;
                        pq.add(new Node(next.end, dist[next.end]));
                    }
                }
            }
        }
    }
}
