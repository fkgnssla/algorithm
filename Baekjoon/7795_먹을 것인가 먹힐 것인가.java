import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int a[] = new int[n];
            int b[] = new int[m];

            //a입력
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<n;j++) {
                a[j] = Integer.parseInt(st.nextToken());
            }
            //b입력
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<m;j++) {
                b[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(b);
            int result = 0;

            for(int j=0;j<n;j++) {
                int start = 0, end = m - 1;
                int max=-1;
                while (start <= end) {
                    int mid = (start + end) / 2;

                    if (a[j]<=b[mid]) end=mid-1;
                    else if (a[j]>b[mid]){
                        if(max<mid) max=mid;
                        start=mid+1;
                    }
                }
                result+=(max+1);
            }
            bw.write(result + "\n");
        }
        bw.flush();
    }
}
