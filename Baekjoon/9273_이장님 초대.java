import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Integer arr[] = new Integer[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr, Collections.reverseOrder());
        int max=-1;
        for(int i=0;i<n;i++) {
            arr[i]+=(i+1);
            if(max<arr[i]) {
                max=arr[i];
            }
        }

        int sum = max+1;
        System.out.println(sum);
    }
}
