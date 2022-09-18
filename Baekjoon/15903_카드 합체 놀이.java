import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long arr[] = new long[n];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<m;i++) {
            Arrays.sort(arr);
            long k = arr[0] + arr[1];
            arr[0] = arr[1] = k;
        }
        long result=0;
        for(int i=0;i<n;i++) {
            result += arr[i];
        }
        bw.write(""+result); bw.flush();
    }
}
