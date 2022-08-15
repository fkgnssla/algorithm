import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine()); //테스트케이스

        int arr[];
        for(int i=0;i<t;i++) {
            long sum = 0;
            int n = Integer.parseInt(br.readLine());
            arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<n;j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int max=0;
            for(int k=n-1;k>=0;k--) {
                if(arr[k]>max) max=arr[k];
                else {
                    sum+=(max-arr[k]);
                }
            }
            sb.append(sum+"\n");
        }
        bw.write(sb+""); bw.flush();
    }
}
