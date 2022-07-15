import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        
        String srr[][] = new String[n][2];
        for(int i=0;i<n;i++) {
            String str[] = br.readLine().split(" ");
            srr[i][0] = str[0];
            srr[i][1] = str[1];
        }
        
        Arrays.sort(srr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int a = Integer.parseInt(o1[0]);
                int b = Integer.parseInt(o2[0]);
                return a-b;
            }
        });
        
        for(int i=0;i<n;i++) {
            System.out.println(srr[i][0] + " " + srr[i][1]);
        }
    }
}
