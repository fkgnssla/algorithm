import java.io.*;
import java.util.*;

public class Main {
    static int[][] g;
    static boolean visited[][];
    static int dx[] = {0,0,-1,1};
    static int dy[] = {-1, 1, 0, 0};
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());

        g = new int[n][n];
        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<n;j++) {
                g[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count;
        int max = 0;
        for(int h=1;h<=100;h++) {
            count=0;
            visited = new boolean[n][n];
            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                    if(g[i][j]>h && visited[i][j] == false) {
                        bfs(i,j,h); count++;
                    }
                }
            }
            if(max<count) max=count;
        }
        
        if(max==0) max = 1;
        bw.write(max + "");
        bw.flush();
    }

    public static void bfs(int i, int j, int h) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        visited[i][j] = true;
        
        while(!q.isEmpty()) {
            int node[] = q.poll();
            i = node[0];
            j = node[1];
            for (int k = 0; k < 4; k++) {
                int x = i + dx[k];
                int y = j + dy[k];
                if (x < 0 || y < 0 || x >= n || y >= n) continue;
                if (g[x][y] > h && visited[x][y] == false) {
                    visited[x][y] = true;
                    q.add(new int[]{x, y});
                }
            }
        }
    }
}
