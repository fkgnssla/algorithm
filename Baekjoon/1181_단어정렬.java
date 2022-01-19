package Silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class s1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int i;
        String[] str = new String[N];

        for (i = 0; i < N; i++) 
        	str[i] = br.readLine();
        
        //사전순 정렬
        Arrays.sort(str);
        //길이순 정렬
        Arrays.sort(str, new Comparator<String>() {
        	@Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        
        for(i=0;i<str.length-1;i++) {
			if(str[i].equals(str[i+1])) continue;
			bw.write(str[i]+"\n"); bw.flush();
		}
		bw.write(str[i]); bw.flush();
		bw.close();
    }
}
