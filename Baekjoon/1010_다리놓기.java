package Silver5;

import java.math.BigInteger;
import java.util.Scanner;

public class s1010 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int n,m;
		BigInteger sum[] = new BigInteger[t];
		
		for(int i=0;i<t;i++) {
			n = s.nextInt();
			m = s.nextInt();
			sum[i] = new BigInteger("1");
			for(int j=0;j<n;j++) 
				sum[i] = sum[i].multiply(new BigInteger(String.valueOf(m-j)));
			for(int j=0;j<n;j++) 
				sum[i] = sum[i].divide(new BigInteger(String.valueOf(n-j)));
		}
		for(int i=0;i<t;i++)
			System.out.println(sum[i]);
	}
}
