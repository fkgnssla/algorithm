import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer>a = new ArrayList<>(n);
        for(int i=0;i<n;i++) {
            a.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(a);
        long result=0;
        int rank=1;
        for(int i=0;i<n;i++) {
            result += Math.abs(a.get(i) - (rank++));
        }

        System.out.println(result);
    }
}
