import java.io.*;
import java.util.*;

public class Main {
    static boolean visited[];
    static ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        visited = new boolean[n+1];

        //그래프 초기화
        for (int i = 0; i <= n; i++) {
            g.add(new ArrayList<Integer>());
        }

        for(int i=0;i<m;i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            g.get(a).add(b);
            g.get(b).add(a);
        }
        int result=0;
        for(int i=1;i<=n;i++) {
            if(dfs(i)) result++;
        }

        bw.write(result + "");
        bw.flush();
    }

    public static boolean dfs(int x) {
        boolean flag = false;
        if(!visited[x]) {
            visited[x] = true;
            flag = true;
        }

        for(int i=0;i<g.get(x).size();i++) {
            int y = g.get(x).get(i);
            if(!visited[y]) {
                dfs(y);
            }
        }
        return flag;
    }
}
