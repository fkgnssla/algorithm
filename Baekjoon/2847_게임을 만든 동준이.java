import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        int sum=0;
        int arr[] = new int[n];
        for(int i=1;i<=n;i++) {
            arr[n-i]=sc.nextInt();
            sc.nextLine();
        }
        for(int i=0;i<n-1;i++) {
            int cur=arr[i+1];
            int pre=arr[i];
            if(pre<=cur){
                sum+=(cur-pre)+1;
                arr[i+1]=arr[i]-1;
            }
        }
        System.out.println(sum);
    }
}
