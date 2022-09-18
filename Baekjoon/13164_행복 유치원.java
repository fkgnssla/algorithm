import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int arr[] = new int[n-1];
        st = new StringTokenizer(br.readLine(), " ");
        
        int pre = Integer.parseInt(st.nextToken());
        int cur = 0;
        for (int i=0;i<n-1;i++) {
            cur = Integer.parseInt(st.nextToken());
            arr[i] = cur-pre;
            pre = cur;
        }

        Arrays.sort(arr);
        long result = 0;
        
        //조가 k개면 k-1개 버릴 수 있으므로, 작은 값부터 결과값에 더한다.
        for (int i = 0; i < arr.length - (k - 1); i++) {
            result+=arr[i];
        }
        System.out.println(result);
    }
}
