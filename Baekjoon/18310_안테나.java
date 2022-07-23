import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        String s[] = sc.nextLine().split(" ");
        Integer home[] = new Integer[n];
        
        for(int i=0;i<n;i++) {
            home[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(home);
        
        int index;
        if(n%2==0) {
            index = n/2-1;
        }else {
            index = n/2;
        }

        System.out.println(home[index]);

    }
}
