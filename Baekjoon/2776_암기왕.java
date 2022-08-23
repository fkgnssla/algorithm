import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<Integer> set = new HashSet<>();
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<n;j++) {
                set.add(Integer.parseInt(st.nextToken()));
            }

            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<m;j++) {
                int k = Integer.parseInt(st.nextToken());
                if(!set.add(k)) bw.write(1 + "\n");
                else {
                    set.remove(k);
                    bw.write(0 + "\n");
                }
            }
            set.clear();
        }

        bw.flush();
    }
}
