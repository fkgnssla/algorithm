import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String p1[] = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());
        String p2[] = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        Arrays.sort(p1);
        for(int i=0;i<m;i++) {
            if(0>Arrays.binarySearch(p1, p2[i])) {
                sb.append("0 ");
            }else {
                sb.append("1 ");
            }
        }

        bw.write(sb+""); bw.flush();
    }
}
