import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        String srr[] = new String[n];
        int pri[] = new int[26];

        for(int i=0;i<n;i++) {
            String str = sc.nextLine();
            srr[i] = str;
            int len = str.length();
            for(int j=0;j<len;j++) {
                int p = (int)(Math.pow(10,(len-j)));
                pri[str.charAt(j)-65]+=p;
            }
        }

        int alpha[] = new int[26];
        int v=9;
        for(int i=0;i<26;i++) {
            int max=0,index=0;
            for(int j=0;j<26;j++) {
                if(max<pri[j]) {
                    max=pri[j];
                    index=j;
                }
            }
            if(max!=0) {
                alpha[index] = v--;
                pri[index] = -1;
            }
        }

        int sum=0;
        for(int i=0;i<n;i++) {
            int len = srr[i].length();
            int t=0;
            for(int j=0;j<len;j++) {
                t+=alpha[srr[i].charAt(j)-65];
                t*=10;
            }
            sum+=t/10;
        }
        System.out.println(sum);
    }
}
