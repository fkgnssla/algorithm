import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken()); //참가자수
        int m = Integer.parseInt(st.nextToken()); //능력
        int k = Integer.parseInt(st.nextToken()); //본선 진출자의 수
        double arr[] = new double[n];
        
        for(int i=0;i<m;i++) {
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<n;j++) {
                int num = Integer.parseInt(st.nextToken())-1;
                double value = Double.parseDouble(st.nextToken());
                if(arr[num]<value) arr[num]=value;
            }
        }
        Arrays.sort(arr);
        double sum=0;
        int len = arr.length;
        for(int i=1;i<=k;i++)
            sum+=arr[len-i];
        double result = Math.round(sum*10)/10.; //소수점 첫째자리까지 반올림
        System.out.println(result);
    }

}
