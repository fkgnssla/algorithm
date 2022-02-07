package Silver1;

import java.util.Scanner;

public class s9020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();  sc.nextLine();
		boolean prime[] = new boolean[10000];
		StringBuilder sb = new StringBuilder();
		
		//2~9999사이의 소수 판별 배열 만들기 
		int index=0;
		for(int i=2;i<10000;i++) {
			if(isPrime(i)==true) prime[i] = true;
		}
		
		while(t!=0) {
			int n = sc.nextInt(); sc.nextLine();
			int a = n/2;
			int b = n/2;
			
			//골드바흐의 파티션 찾기
			while(true) {
				if(prime[a] && prime[b]) { //a,b 둘 다 소수일 경우
					if(a+b == n) //가장 처음 나오는 값의 차이가 가장 작으므로 탈출
						break;
				}
				a--; b++;
			}
			
			sb.append(a + " " + b + "\n");
			t--;
		}
		System.out.print(sb);
	}
	
	static boolean isPrime(int num) {
			for(int i=2;i*i<=num;i++) {
				if(num%i==0) return false;
			}
			return true;
		}
}
