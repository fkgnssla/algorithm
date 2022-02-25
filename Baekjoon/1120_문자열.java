package Silver4;

import java.io.*;

public class s1120 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		
		String str[] = bf.readLine().split(" ");
		int lengthA=str[0].length();
		int lengthB=str[1].length();
		int save=51;
		int sum=0;
		
		for(int i=0;i<=lengthB-lengthA;i++) {
			sum=0;
			for(int j=i;j<i+lengthA;j++) {
				if(str[0].charAt(j-i) != str[1].charAt(j)) sum++;
			}
			if(save>sum) save=sum;
		}
		bw.write(save+""); bw.flush();
	}
}
