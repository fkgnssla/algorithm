package bronze3;

import java.util.Scanner;

public class b10951 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a,b;
		while(true) {
			try {
				a = sc.nextInt();
				b = sc.nextInt();
			}catch(Exception e) {
				break;
			}
			sb.append(a+b+"\n");
		}
		System.out.print(sb);
	}

}
