import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());

        Integer[] cal = new Integer[n];
        long sum[] = new long[n];
        for(int i=0;i<n;i++) cal[i]=Integer.parseInt(br.readLine());
        Arrays.sort(cal, Collections.reverseOrder());
        for(int i=0;i<n;i++) {
            if(i==0) sum[i]=cal[i]+c;
            else sum[i]+=sum[i-1]+cal[i];
        }

        long max=c/a; //토핑 안 올렸을 때, 1원당 열량
        int price=a;
        for(int i=0;i<n;i++) {
            price+=b;
            if(sum[i]/price>max) {
                max=sum[i]/price;
            }
        }

        bw.write(max+""); bw.flush();
    }
}
