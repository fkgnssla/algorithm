import java.util.*;
import java.io.*;

class Main {
    static int n, m;
    static int max = Integer.MIN_VALUE; //모든 최단거리 중 최댓값
    static char[][] arr;
    static boolean[][] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            arr[i] = str.toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 'L') {
                    visited = new boolean[n][m];
                    curMax = Integer.MIN_VALUE;

                    bfs(i, j);

                    if(curMax > max) max = curMax;
                }
            }
        }

        System.out.println(max);
    }

    static int curMax; //최단거리 중 최댓값
    static int rx[] = {0, 0, -1, 1};
    static int ry[] = {-1, 1, 0, 0};
    static void bfs(int x, int y) {
        Deque<int[]> q = new ArrayDeque<>();
        q.addLast(new int[]{x, y, 0});

        visited[x][y] = true;
        while(!q.isEmpty()) {
            int[] now = q.pollFirst();
            if(now[2] > curMax) curMax = now[2];

            for (int i = 0; i < 4; i++) {
                int nx = now[0] + rx[i];
                int ny = now[1] + ry[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (visited[nx][ny]) continue;
                if(arr[nx][ny] == 'W') continue;

                visited[nx][ny] = true;
                q.addLast(new int[]{nx, ny, now[2] + 1});
            }
        }

    }
}
