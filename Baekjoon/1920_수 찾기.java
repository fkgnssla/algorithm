package Silver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class s1920 {

	public static void main(String[] args) throws IOException,ArrayIndexOutOfBoundsException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//N개의 수를 받아 A[]에 저장
		int n = Integer.parseInt(bf.readLine());
		String A[] = bf.readLine().split(" ");
		int a[] = new int[n];
		for(int i=0;i<n;i++) a[i] = Integer.parseInt(A[i]);
		Arrays.sort(a);		//오름차순 정렬
		
		//M개의 수를 받아 B[]에 저장
		int m = Integer.parseInt(bf.readLine());
		String B[] = bf.readLine().split(" ");
		int b[] = new int[m];
		for(int i=0;i<m;i++) b[i] = Integer.parseInt(B[i]);
		
		//이진탐색을 하여 a[]에 찾는 값이 있으면 1 없으면 0을 출력
		for(int i=0;i<m;i++) {
			int middle;
			int low=0,high=a.length-1;
			boolean flag =false;
			while(low<=high){
				middle = (low + high) / 2;
				if (b[i] < a[middle]) high = middle - 1;
				else if (b[i] > a[middle]) low = middle + 1;
				else {flag=true; break;}
			}
			if(flag) bw.write(1+"\n");
			else bw.write(0+"\n");
		}
		bw.close();
	}
}
