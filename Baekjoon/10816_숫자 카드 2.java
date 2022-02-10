package Silver4;

import java.io.*;
import java.util.HashMap;

public class s10816 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		
		int n = Integer.parseInt(bf.readLine());
		HashMap<String, Integer> map = new HashMap<>(n);
		String key[] = bf.readLine().split(" ");
		
		for(int i=0;i<n;i++) {
			if(map.get(key[i])==null)
				map.put(key[i], 1);
			else {
				int value = map.get(key[i]);
				map.put(key[i], value+1);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		int m = Integer.parseInt(bf.readLine());
		key = bf.readLine().split(" ");
		
		for(int i=0;i<m;i++) {
			if(map.get(key[i])==null)
				sb.append(0+" ");
			else
				sb.append(map.get(key[i])+" ");
		}
		
		bw.write(sb+""); bw.flush();
	}
}
