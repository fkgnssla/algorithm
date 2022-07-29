import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Integer [] arr = new Integer[n];

        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr,Collections.reverseOrder());
        long sum=0;
        int z=0;
        for(int i=0;i<n;i++) {
            if(arr[i]-z>0) sum+=arr[i]-(z++);
            else break;
        }
        bw.write(sum+""); bw.flush();
    }
}
