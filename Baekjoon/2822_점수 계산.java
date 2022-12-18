import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[8][2];
        for(int i=0;i<8;i++) {
            arr[i][0] = i;
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1]-o1[1];
            }
        });

        int sum = 0;
        int list[] = new int[5];
        for(int i=0;i<5;i++) {
            sum+=arr[i][1];
            list[i]=(arr[i][0]+1);
        }
        
        System.out.println(sum);
        Arrays.sort(list);
        for(int i : list) System.out.print(i + " ");
    }
}
