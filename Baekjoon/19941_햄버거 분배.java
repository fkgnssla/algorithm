import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String[] s =  br.readLine().split("");
        int count=0;
        for(int i=0;i<n;i++) {
            if(s[i].equals("P")) {
                for(int j=Math.max(0,i-k);j<=Math.min(n-1, i+k);j++) {
                    if(s[j].equals("H")) {
                        s[j]="O"; count++; break;
                    }
                }
            }
        }
        bw.write(count+""); bw.flush();
    }
}
