import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt(); sc.nextLine();
        Integer arr[] = new Integer[m];
        for(int i=0;i<m;i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
          //arr[i] = sc.nextInt(); sc.nextLine();
        }
        Arrays.sort(arr, Collections.reverseOrder());

        int price=0; //책정 가격
        int max=0; //올릴 수 있는 최대 수익
        int minIdx = Math.min(n,m);

        for(int i=0;i<minIdx;i++) {
            if (arr[i] * (i + 1) > max) { //이전 수익보다 더 높을 경우
                price = arr[i];
                max = arr[i] * (i + 1);
            }
        }

        System.out.println(price + " " + max);
    }
}
