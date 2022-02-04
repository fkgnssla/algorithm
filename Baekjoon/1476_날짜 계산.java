package Silver5;

import java.util.Scanner;

public class s1476 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt(); //1 ≤ E ≤ 15
		int S = sc.nextInt(); //1 ≤ S ≤ 28
		int M = sc.nextInt(); //1 ≤ M ≤ 19
		int count=1;
		
		//E,S,M 1씩빼서 셋다 1이되는 순간까지 세기
		while(E!=1 || S!=1 || M!=1) {
			E--; S--; M--;
			if(E==0) E=15;
			if(S==0) S=28;
			if(M==0) M=19;
			count++;
		}
		System.out.print(count);
	}

}
