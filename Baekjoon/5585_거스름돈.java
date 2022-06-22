package Bronze2;

import java.util.Scanner;

public class b5585 {
// 500엔, 100엔, 50엔, 10엔, 5엔, 1엔
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int t = 1000-m;
		int n=0;
		
		int a = t/500; n+=a; t-=500*a;
		a = t/100; n+=a; t-=100*a;
		a = t/50; n+=a; t-=50*a;
		a = t/10; n+=a; t-=10*a;
		a = t/5; n+=a; t-=5*a;
		a = t/1; n+=a; t-=1*a;
		
		System.out.print(n);
	}

}
