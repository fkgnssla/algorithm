import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = "";
        String str2 = "";

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int diffBWNum = 0; //B,W 개수차이
            int diffPatternNum = 0; //다른 패턴의 개수
            int str1W = 0; //초기상태의 W 갯수
            int str2W = 0; //목표상태의 W 갯수

            str1 = br.readLine();
            str2 = br.readLine();
            for (int j = 0; j < n; j++) {
                if(str1.charAt(j) != str2.charAt(j)) diffPatternNum+=1;
                if(str1.charAt(j) == 'W') str1W+=1;
                if(str2.charAt(j) == 'W') str2W+=1;
            }
            diffBWNum = Math.abs(str1W - str2W);
            int result = (diffPatternNum - diffBWNum) / 2 + diffBWNum;
            sb.append(result + "\n");
        }
        bw.write(sb.toString()); bw.flush();
    }
}
