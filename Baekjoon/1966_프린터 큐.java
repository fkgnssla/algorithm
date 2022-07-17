import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<t;i++) {
            int n = sc.nextInt(); int m = sc.nextInt();
            sc.nextLine();
            
            int max=0;
            int srr[] = new int[n];
            
            for(int j=0;j<n;j++) {
                srr[j] = sc.nextInt();
                if(srr[j]>max) max=srr[j];
            }
            
            int count=1;
            int index=0;
            while(true) {
                if(srr[index]>=max){
                    if(index==m) break;
                    srr[index]=-1;
                    max = Arrays.stream(srr).max().getAsInt();
                    count++;
                }
                index++;
                index%=n;
            }
            
            sb.append(count+"\n");
        }
        System.out.println(sb);
    }
}
