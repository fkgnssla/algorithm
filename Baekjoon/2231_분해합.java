package Bronze2;

import java.util.Scanner;

public class b2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int m=1; //생성자
		int sum;
		
		while(m<n) {
			sum=0;
			sum+=m;
			int c = m;
			while(c!=0) {
				sum+=c%10;
				c/=10;
			}
			if(sum==n) { //생성자 구해졌을 때
				System.out.print(m); break;
			}
			m++;
		}
		if(m>=n) { //생성자 구해지지 않았을 때
			System.out.print(0);
		}
	}
}
