package Silver4;

import java.util.Scanner;

public class s1015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.nextLine();
		int A[] = new int[n];
		int P[] = new int[n];
		
		for(int j=0;j<n;j++) {
			A[j] = sc.nextInt();
		}
		
		int indexA=0; //A배열의 인덱스 저장변수
		int valueP=0; //B배열의 인덱스라고 볼 수 있음
		for(int i=0;i<n;i++) {
			int min=1001;
			for(int j=0;j<n;j++) {
				if(min>A[j]) {
					min=A[j]; indexA=j;
				}
			}
			P[indexA]=valueP++;
			A[indexA]=1001;
		}
		for(int i=0;i<n;i++) {
			System.out.print(P[i]+" ");
		}
	}
}
