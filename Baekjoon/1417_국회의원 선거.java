import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        int da = sc.nextInt(); sc.nextLine();
        Integer arr[] = new Integer[n-1];

        for(int i=0;i<n-1;i++) {
            arr[i] = sc.nextInt(); sc.nextLine();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int count = 0;
        if(n!=1) {
            while (true) {
                if (da > arr[0]) break;
                count++;
                arr[0] -= 1;
                da++;
                Arrays.sort(arr, Collections.reverseOrder());
            }
        }
        System.out.println(count);
    }
}
