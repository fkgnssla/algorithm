package Silver1;

import java.io.*;

public class s11052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int p[] = new int[n+1]; //p[n]="﻿카드 n개가 포함된 카드 팩의 금액"
		String str[] = br.readLine().split(" ");
		for(int i=0;i<n;i++) {
			p[i+1] = Integer.parseInt(str[i]);
		}
		
		int dp[] = new int[n+1]; //dp[n]="﻿n개의 카드를 구매하기 위한 최댓값"
		dp[1] = p[1]; //dp[1]은 항상 p[1]이다.
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				dp[i] = Math.max(dp[i], dp[i-j]+p[j]);
			}
		}
		
		System.out.print(dp[n]);
	}

}
