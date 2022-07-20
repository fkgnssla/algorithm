import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<t;i++) {
            int num = Integer.parseInt(br.readLine());

            String woodStr[] = br.readLine().split(" ");
            Integer woodInt[] = new Integer[num];
            int line[] = new int[num];
            for(int j=0;j<num;j++) {
                woodInt[j] = Integer.parseInt(woodStr[j]);
            }

            Arrays.sort(woodInt);
            int index=0;
            for(int j=0;j<num;j++) {
                if(j%2==0) line[index++] = woodInt[j];
                else line[num - index] = woodInt[j];
            }

            int max = 0;
            for(int j=0;j<num;j++) {
                if(max<Math.abs(line[j]-line[(j+1)%num]))
                    max = Math.abs(line[j]-line[(j+1)%num]);
            }
            sb.append(max+"\n");
        }
        bw.write(sb + ""); bw.flush();
    }
}
