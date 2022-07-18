import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(br.readLine());

        String srr[] = br.readLine().split(" ");
        int count=0;
        int max = count;
        int cnt=Integer.parseInt(srr[0]);
        
        for(int i=1;i<n;i++) {
            if(cnt>Integer.parseInt(srr[i])){
                count++;
            } else {
                cnt=Integer.parseInt(srr[i]);
                if(max<count) max=count;
                count=0;
            }
        }
        if(max<count) max=count;
        System.out.println(max);
    }
}
