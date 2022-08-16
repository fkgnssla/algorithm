import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringBuilder ve = new StringBuilder();
        
        String str = br.readLine();
        boolean flag=false;
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            if(c == '<') {
                if(ve.length()!=0) { //문자열 뒤집어 저장
                    sb.append(ve.reverse()); ve.setLength(0);
                }
                flag=true;
            }
            if(c == '>') {
                flag=false;
                sb.append(c);
                continue;
            }
            
            if(flag) {
                sb.append(c);
            }
            else {
                if(c==' ') { //문자열 뒤집어 저장
                    sb.append(ve.reverse() + " ");
                    ve.setLength(0); //sb초기화
                }else {
                    ve.append(c);
                }
            }
        }
        //문자열 뒤집어 저장
        if(ve.length()!=0) sb.append(ve.reverse());
        bw.write(sb+""); bw.flush();
    }
}
