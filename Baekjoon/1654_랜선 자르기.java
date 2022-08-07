import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int k = Integer.parseInt(st.nextToken()); //갖고 있는 랜선의 수
        int n = Integer.parseInt(st.nextToken()); //필요한 랜선의 수

        int ran[] = new int[k];
        //랜선 입력받기
        for(int i=0;i<k;i++) ran[i] = Integer.parseInt(br.readLine());

        long result=0;
        long start=0;
        long end = Arrays.stream(ran).max().getAsInt();
        //이진탐색 기준: 랜선의 수, 이진탐색의 범위: 랜선의 길이
        while(start<=end) {
            long mid = (start+end)/2; //랜선 길이
            if(mid==0) mid=1;
            
            long count=0;
            for(int i=0;i<k;i++) {
                count+=ran[i]/mid;
            }
            //랜선의 수가 부족하다면 랜선의 길이 줄이기
            if(count<n) end=mid-1;
            //랜선의 수가 충분하다면 랜선의 길이 최대한 늘려보기
            else {
                result = mid;
                start=mid+1;
            }
        }
        System.out.println(result);
    }
}
