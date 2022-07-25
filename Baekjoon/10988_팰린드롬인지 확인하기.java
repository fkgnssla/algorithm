import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int len = str.length();
        for(int i=0;i<len/2;i++) {
            if(str.charAt(i)!=str.charAt(len-i-1)) {
                System.out.println(0); return;
            }
        }
        System.out.println(1);
    }
}
