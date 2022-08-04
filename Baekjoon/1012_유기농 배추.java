import java.io.*;
import java.util.*;

public class Main {
    static int [][] g;
    static int m,n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<t;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            m = Integer.parseInt(st.nextToken()); 
            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            g=new int[m][n];
            
            //배추 심기
            for(int j=0;j<k;j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                g[x][y] = 1;
            }
            
            //모든 칸 탐색 수행
            int count=0;
            for(int z=0;z<m;z++) {
                for(int l=0;l<n;l++) {
                    if(dfs(z,l)) count++;
                }
            }
            sb.append(count+"\n");
        }
        System.out.println(sb);
    }

    static int dx[] = {0,0,-1,1};
    static int dy[] = {-1,1,0,0};
    static boolean dfs(int x, int y) {
        if(g[x][y]==0) return false;
        g[x][y]=0;

        for(int i=0;i<4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx<0 || ny <0 || nx>=m || ny>=n) continue;
            if(g[nx][ny]==1) dfs(nx,ny);
        }
        return true;
    }

}
