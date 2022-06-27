import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int count = 1;

        while(true) {
            int l = sc.nextInt();
            int p = sc.nextInt();
            int v = sc.nextInt(); sc.nextLine();
            if(l==0) break;

            int t = v/p;
            int sum = t*l;
            v-=t*p;

            if(v<l) sum+=v;
            else sum+=l;

            sb.append("Case " + count + ": " + sum + "\n");
            count++;
        }

        System.out.println(sb);
    }
}
