import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet();
        for(int i=0;i<n;i++) {
            set.add(br.readLine());
        }
        int count=0;
        for(int i=0;i<m;i++) {
            String s = br.readLine();
            if(!set.add(s)) count++;
            else set.remove(s);
        }
        bw.write(count+""); bw.flush();
    }
}
