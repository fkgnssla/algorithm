import java.io.*;
import java.util.*;

public class Main {
    static int[][] g;
    static int dx[] = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int dy[] = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int l;
    static int startX;
    static int startY;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++) {
            l = Integer.parseInt(br.readLine());
            g = new int[l][l];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            startX = Integer.parseInt(st.nextToken());
            startY = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine(), " ");
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            g[startX][startY] = 0;
            bfs(startX, startY);
            sb.append(g[endX][endY]+"\n");
        }
        bw.write(sb+"");
        bw.flush();
    }

    public static void bfs(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        while(!q.isEmpty()) {
            int node[] = q.poll();
            i = node[0];
            j = node[1];
            for (int k = 0; k < 8; k++) {
                int x = i + dx[k];
                int y = j + dy[k];
                if (x < 0 || y < 0 || x >= l || y >= l || (x==startX && y==startY)) continue;
                if (g[x][y] == 0) {
                    g[x][y] = g[i][j] + 1;
                    q.add(new int[]{x, y});
                }
            }
        }
    }
}
