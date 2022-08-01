import java.util.*;

public class Main {
    static int g[][] = new int[25][25];
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); sc.nextLine();

        for(int i=0;i<n;i++) {
            String str = sc.nextLine();
            for(int j=0;j<n;j++) {
                g[i][j] = str.charAt(j) - '0';
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(g[i][j]==1) arr.add(bfs(i, j));
            }
        }
        System.out.println(arr.size());
        Collections.sort(arr);
        for(int i : arr) System.out.println(i);
    }

    static int dx[] = {-1,1,0,0};
    static int dy[] = {0,0,-1,1};
    private static int bfs(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        int count=0;

        q.add(new int[]{i, j});
        g[i][j]=0;

        while(!q.isEmpty()) {
            int cur[] = q.poll();
            count++;
            i = cur[0]; j = cur[1];
            for(int z=0;z<4;z++) {
                int nx = i+dx[z];
                int ny = j+dy[z];
                if(nx<0 || ny<0 || nx>=n || ny>=n) continue;
                if(g[nx][ny]==1) {
                    q.add(new int[]{nx, ny});
                    g[nx][ny]=0;
                }
            }
        }
        return count;
    }
}
