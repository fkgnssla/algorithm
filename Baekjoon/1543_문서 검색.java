import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String word = sc.nextLine();
        int sum=0;
        int len=word.length();
        
        for(int i=0;i<=s.length()-len;i++) {
            if(word.equals(s.substring(i,i+len))) {
                sum++;
                i+=len-1;
            }
        }
        System.out.println(sum);
    }
}
