import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
    static int n, l, r;
    static int arr[][];
    static boolean visited[][];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int moveCount = 0;
        while(true) {
            boolean move = false;
            visited = new boolean[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    xyList.clear();
                    xyList.add(new int[]{i, j});
                    peopleSum = arr[i][j];
                    countryCnt = 1;

                    // 방문하지 않은 나라일 경우에만 DFS
                    if(!visited[i][j]) {
                        visited[i][j] = true;
                        dfs(i, j);
                        if (xyList.size() != 1) {
                            // 인구 수 갱신
                            for (int[] xy : xyList) {
                                arr[xy[0]][xy[1]] = (int) peopleSum / countryCnt;
                            }
                            move = true;
                        }
                    }
                }
            }

            if(!move) break;
            else moveCount += 1;
        }

        System.out.println(moveCount);
    }

    static long peopleSum;
    static int countryCnt;
    static ArrayList<int[]> xyList = new ArrayList<>();
    static int rx[] = {0, 0, -1, 1};
    static int ry[] = {-1, 1, 0, 0};
    static void dfs(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + rx[i];
            int ny = y + ry[i];

            if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
            if(visited[nx][ny]) continue;
            int degree = Math.abs(arr[x][y] - arr[nx][ny]);
            if(l > degree || r < degree) continue;

            visited[nx][ny] = true;
            peopleSum += arr[nx][ny];
            countryCnt += 1;

            // nx, ny 리스트에 저장해놓고 나중에 값 바꿔야함 => sum / count
            xyList.add(new int[]{nx, ny});
            dfs(nx, ny);
        }
    }
}
