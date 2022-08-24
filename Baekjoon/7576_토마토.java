import java.io.*;
import java.util.*;

public class Main {
    static int[][] g;
    static int m;
    static int n;
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};
    static Queue<int []> q = new LinkedList();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        g = new int[n][m];
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<m;j++) {
                g[i][j] = Integer.parseInt(st.nextToken());
                if(g[i][j] == 1) {
                    q.add(new int[]{i, j});
                }
            }
        }

        bw.write(bfs() + ""); bw.flush();
    }

    public static int bfs() {

        while(!q.isEmpty()) {
            int[] node = q.poll();
            int i = node[0];
            int j = node[1];

            for(int k=0;k<4;k++) {
                int x = i + dx[k];
                int y = j + dy[k];
                if(x<0 || y<0 || x>=n || y>=m) continue;
                if(g[x][y]==0) {
                    g[x][y] = g[i][j] + 1; //익은 날짜 저장
                    q.add(new int[]{x, y});
                }
            }
        }

        int result = -1;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(g[i][j] == 0) return -1; //토마토가 모두 익지 못 하는 상황
                if(g[i][j]>result) result = g[i][j]; //촤대 날짜 구하기
            }
        }
        //익은 날짜 - 1 해줘야함
        return result-1;
    }
}
