import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); sc.nextLine();
        int c = sc.nextInt();

        c%=1440;
        a+=(c/60);
        c%=60;
        b+=c;

        a=a%24;
        if(b>=60) {
            a++;
            a=a%24;
            b%=60;
        }
        System.out.println(a + " " + b);
    }
}
