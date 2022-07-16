import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); scanner.nextLine();
        String str;
        for(int i = 0; i < T; i++) {
            str = scanner.nextLine();
            int sum=0;
            int count=1;
            for(int j=0;j<str.length();j++) {
                if(str.charAt(j)=='O') {
                    sum+=count;
                    count++;
                }else {
                    count=1;
                }
            }
            System.out.println(sum);
        }
    }
}
