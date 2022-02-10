package Silver3;

import java.io.*;

public class s9095 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		int arr[]= new int[12];
		
		arr[1] = 1; arr[2] = 2; arr[3] = 4;
		for(int i=4;i<12;i++) {
			arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
		}
		
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(bf.readLine());
		for(int i=0;i<t;i++) {
			int n = Integer.parseInt(bf.readLine());
			sb.append(arr[n]+"\n");
		}

		bw.write(sb+""); bw.flush();
	}

}
