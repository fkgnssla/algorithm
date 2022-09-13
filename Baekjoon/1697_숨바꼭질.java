import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(bfs(n, k));
    }

    static int bfs(int n, int k) {
        boolean visited[] = new boolean[100001];
        Queue<int[]> q = new LinkedList();
        int count = 0;
        q.add(new int[]{n, count});

        while(!q.isEmpty()) {
            int nc[] = q.poll();
            n = nc[0];
            int c = nc[1];
            if(n==k) {
                return c;
            }

            if(n>100000) continue;
            if(0<=n-1){
                if(!visited[n - 1]) {
                    visited[n - 1] = true;
                    q.add(new int[]{n - 1, c + 1});
                }
            }
            if(n<k) {
                if(n+1<100001) {
                    if (!visited[n + 1]) {
                        visited[n + 1] = true;
                        q.add(new int[]{n + 1, c + 1});
                    }
                }
                if(n*2<100001) {
                    if (!visited[n * 2]) {
                        visited[n * 2] = true;
                        q.add(new int[]{n * 2, c + 1});
                    }
                }
            }
        }
        return -1;
    }
}
