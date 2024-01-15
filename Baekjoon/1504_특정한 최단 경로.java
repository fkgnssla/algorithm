import java.util.*;
import java.io.*;

class Main {
    static ArrayList<ArrayList<Node>> g = new ArrayList();
    static int dist[]; // 최단 거리
    static int n, e, u, v;
    static final int INF = 200000000;

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
        n = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());

        // 초기화
        visited = new boolean[n + 1];
        dist = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            g.add(new ArrayList<Node>());
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            g.get(a).add(new Node(b, c));
            g.get(b).add(new Node(a, c));
        }
        st = new StringTokenizer(br.readLine());
        u = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        int result1 = 0, result2 = 0;
        result1 += dijkstra(1, u);
        result1 += dijkstra(u, v);
        result1 += dijkstra(v, n);

        result2 += dijkstra(1, v);
        result2 += dijkstra(v, u);
        result2 += dijkstra(u, n);

        if (result1 >= INF && result2 >= INF) System.out.println(-1);
        else {
            System.out.println(Math.min(result1, result2));
        }
    }

    static boolean visited[];

    static int dijkstra(int start, int end) {
        Arrays.fill(visited, false);
        Arrays.fill(dist, INF);
        PriorityQueue<Node> pq = new PriorityQueue<>();

        pq.add(new Node(start, 0));
        dist[start] = 0;
        while (!pq.isEmpty()) {
            Node now = pq.poll();
            int cur = now.end;

            if (!visited[cur]) {
                visited[cur] = true;

                for (Node node : g.get(cur)) {
                    if (!visited[node.end] && dist[node.end] > dist[cur] + node.weight) {
                        dist[node.end] = dist[cur] + node.weight;
                        pq.add(new Node(node.end, dist[node.end]));
                    }
                }
            }
        }

        return dist[end];
    }
}
