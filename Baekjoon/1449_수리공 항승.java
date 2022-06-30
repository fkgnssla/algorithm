import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt(); sc.nextLine();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        
        int sum=0;
        for(int i=0;i<n;i++) {
            int len=0;
            for(int j=i;;j++) {
                if(j==n-1) {
                    sum++;
                    i=j; break;
                }
                if(len+(arr[j+1]-arr[j]+1)<=l)
                    len+=arr[j+1]-arr[j];
                else {
                    sum++;
                    i=j; break;
                }
            }
        }
        System.out.println(sum);
    }
}
