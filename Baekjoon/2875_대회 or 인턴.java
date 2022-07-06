import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt(); int k = sc.nextInt();

        for(int i=0;i<k;i++) {
            if(n>=2*m) n-=1;
            else m-=1;
        }

        if(n>=2*m) System.out.println(m);
        else System.out.println(n/2);
    }
}
