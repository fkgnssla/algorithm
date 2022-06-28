import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();   sc.nextLine();
        int pkMin=1000;
        int piMin=1000;
        for(int i=0;i<m;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();   sc.nextLine();
            if(a<pkMin) pkMin=a;
            if(b<piMin) piMin=b;
        }
        int x = (n/6)*pkMin + (n-(n/6)*6)*piMin;
        int y = ((n/6)+1)*pkMin;
        int z = n*piMin;

        if(x<=y && x<=z) System.out.println(x);
        else if(y<=x && y<=z) System.out.println(y);
        else System.out.println(z);

    }
}
