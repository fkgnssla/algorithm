package Silver5;

import java.util.Arrays;
import java.util.Scanner;

public class s1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print(arr[0]*arr[arr.length-1]);
	}

}
