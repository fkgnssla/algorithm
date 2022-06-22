package Bronze4;

import java.util.Scanner;

public class b10162 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int a,b,c;
		
		if(T%10!=0) {
			System.out.print(-1);
		}
		else {
			a = T/300; T-=300*a;
			b = T/60; T-=60*b;
			c = T/10;
			System.out.print(a + " " + b + " " + c);
		}
	}

}
