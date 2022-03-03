package Silver5;

import java.io.*;

public class s2609 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		
		String str[] = bf.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int i;
		
		if(a<b) {
			//최대공약수
			for(i=a;i>0;i--) {
				if(a%i==0 && b%i==0) {
					bw.write(i+""); bw.flush();
					break;
				}
			}
			//최소공배수
			bw.write("\n"+a*b/i); bw.flush();
		}
		else {
			//최대공약수
			for(i=b;i>0;i--) {
				if(a%i==0 && b%i==0) {
					bw.write(i+""); bw.flush();
					break;
				}
			}
			//최소공배수
			bw.write("\n"+a*b/i); bw.flush();
		}
	}

}
