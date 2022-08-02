import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc. nextInt(); sc.nextLine();

        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        int start=0;
        int end=Arrays.stream(arr).max().getAsInt();
        int cnt=0;

        //이진 탐색 수행
        while(start<=end) {
            int h = (start+end)/2;
            long sum=0; //잘라진 나무 높이
            for(int i : arr) {
                //잘랐을 때의 나무의 높이 계산
                if(i>h) sum+=(i-h);
            }
            if(sum<m) end=h-1; //나무의 높이가 부족한 경우 더 많이 자르기(왼쪽 부분 탐색)
            else { //나무의 높이가 충분한 경우 덜 자르기(오른쪽 부분 탐색)
                cnt=h; //최대한 덜 잘랐을 때가 정답이므로, cnt에 계속 기록한다.
                start=h+1;
            }
        }
        System.out.println(cnt);
    }
}
