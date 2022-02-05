package Silver2;

import java.io.*;

public class s4948 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n==0) break;
			int count=0;
			
			for(int j=n+1;j<=n*2;j++) { //n<소수<=2n
				if(isPrime(j)==true) 
					count++;
			}
			sb.append(count+"\n");
		}
		
		bw.write(sb+""); bw.flush();
	}
	static boolean isPrime(int num) {
	//	if(num==1) return false;
		for(int i=2;i*i<=num;i++) {
			if(num%i==0) return false;
		}
		return true;
	}

}
