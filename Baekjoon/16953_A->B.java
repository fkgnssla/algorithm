import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n=1;

        while(x!=y && y!=0) {
            if(y%2==0) y/=2;
            else if((y-1)%10==0) y=(y-1)/10;
            else break;
            n++;
        }

        if(x!=y) System.out.print(-1);
        else System.out.print(n);
    }
}
