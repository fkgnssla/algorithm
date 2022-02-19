package Silver3;

import java.io.*;
import java.util.HashMap;

public class s9375 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t!=0) {
			
			int n = Integer.parseInt(bf.readLine());
			HashMap<String,Integer> map = new HashMap<String,Integer>();
			
			for(int i=0;i<n;i++) {
				String str[] = bf.readLine().split(" ");
				if(map.get(str[1])==null)
					map.put(str[1], 1);
				else {
					map.put(str[1], map.get(str[1])+1);
				}
			}
			
			int sum=1;
			for(int i : map.values()) {
				sum*=(i+1); //(해당 종류의 의상 수+안 입는 경우)C1
			}
			
			sb.append(sum-1 + "\n"); //아무것도 안 입는 경우 빼주기
			
			t--;
		}
		
		System.out.print(sb);
	}

}
