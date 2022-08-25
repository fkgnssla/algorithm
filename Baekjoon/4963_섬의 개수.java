import java.io.*;
import java.util.*;

public class Main {
    static int[][] g;
    static int w;
    static int h;
    static int dx[] = {-1, 1, 0, 0, 1, 1, -1, -1};
    static int dy[] = {0, 0, -1, 1, -1, 1, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if(w==0 && h==0) break;
            g = new int[h][w];
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < w; j++) {
                    g[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int count=0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if(g[i][j]==1) {
                        count++;
                        dfs(i,j);
                    }
                }
            }
            sb.append(count+"\n");
        }
        bw.write(sb+"");
        bw.flush();
    }

    public static void dfs(int i, int j) {
        g[i][j] = 0;
        for(int k=0;k<8;k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            if(x<0 || y<0 || x>=h || y>=w) continue;
            if(g[x][y] == 1) {
                dfs(x,y);
            }
        }
    }
}
