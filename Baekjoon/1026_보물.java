package Silver4;

import java.util.Arrays;
import java.util.Collections;
//import java.util.Comparator;
import java.util.Scanner;

public class s1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //0<N<=50
		sc.nextLine();
		int A[] = new int[N];
		Integer B[] = new Integer[N];
	
		String str[] = sc.nextLine().split(" ");

		for(int i=0;i<N;i++) {
			A[i]=Integer.parseInt(str[i]);
		}
		
		str = sc.nextLine().split(" ");
		for(int i=0;i<N;i++) {
			B[i]=Integer.parseInt(str[i]);
		}
		
		Arrays.sort(A); //오름차순 정렬
		Arrays.sort(B,Collections.reverseOrder()); //내림차순 정렬

//		Arrays.sort(B, new Comparator<Integer>() {
//		@Override
//		public int compare(Integer o1, Integer o2) {
//			if(o1.compareTo(o2)==1) return -1;
//			else if(o1.compareTo(o2)==-1) return 1;
//			else return 0;
//		}
//		});
		
		int sum=0;
		for(int i=0;i<N;i++) {
			sum+=A[i]*B[i];
		}
		System.out.print(sum);
	}

}
