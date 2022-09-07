import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer arr[] = new Integer[n];
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<n-2;i++) {
            if(arr[i]<arr[i+1]+arr[i+2]) {
                System.out.println(arr[i] + arr[i + 1] + arr[i + 2]);
                return;
            }
        }
        System.out.println(-1);
    }
}
