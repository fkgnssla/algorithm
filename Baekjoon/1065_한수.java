package Silver4;

import java.util.*;
import java.io.*;
public class s1065 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		int cnt=0;
		int a,b,c,j;
		for(int i=1;i<=n;i++) {
			j=i;
			if(i<100) cnt++;
			else {
				a = j/100; j=j%100;
				b = j/10;  j=j%10;
				c = j/1;
				if(a-b == b-c) cnt++;
			}
		}
		bw.write(cnt+""); bw.flush();
		bw.close(); bf.close();
	}
}
