package Silver5;

import java.io.*;

public class s1934 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<t;i++) {
			String str[] = bf.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			if(a>b) {
				for(int j=1;j<=b;j++) {
					if(a*j%b==0) {
						sb.append(a*j+"\n"); break;
					}
				}
			}
			else {
				for(int j=1;j<=a;j++) {
					if(b*j%a==0) {
						sb.append(b*j+"\n"); break;
					}
				}
			}
		}
		System.out.print(sb);
	}
}
