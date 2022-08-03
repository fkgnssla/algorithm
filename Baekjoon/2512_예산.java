import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());

        int moneyMax=0;
        int result=0;
        int start = 0, end = Arrays.stream(arr).max().getAsInt();
        while(start<=end) {
            int mid = (start+end)/2; //상한액

            int money=0; //총 예산
            for(int i=0;i<n;i++) {
                if(arr[i]>mid) money+=mid;
                else money+=arr[i];
            }
            if(money<=m && moneyMax<money){ //총 예산을 넘지않는 가능한 최대 예산이면
                moneyMax = money; //예산 기록
                result=mid; //상한액 기록
            }

            if(money<m) start=mid+1;
            else if(money>m) end = mid-1;
            else break;
        }
        System.out.println(result);
    }
}
