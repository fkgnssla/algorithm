import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count=0;

        if(n<3 || n==4) {
            System.out.println(-1); return;
        }
        
        int t;
        if(n/5>0) {
            t=n/5;
            while(true) {
                if ((n - t * 5) % 3 == 0) break;
                t--;
                if(t<0) {
                    System.out.println(-1); return;
                }
            }
            n-=t * 5;
            count+=t;
        }

        if (n/3>0) {
            count+=n/3;
            n%=3;
        }

        System.out.println(count);
    }
}
