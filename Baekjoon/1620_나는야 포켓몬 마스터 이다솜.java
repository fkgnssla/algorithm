package Silver4;

import java.io.*;
import java.util.HashMap;
public class s1620 {

	public static void main(String[] args) throws IOException { 
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		
		String str[] = bf.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		HashMap<String, String> map1 = new HashMap(); //<번호, 포켓몬이름>
		HashMap<String, String> map2 = new HashMap(); //<포켓몬이름, 번호>
		
		for(int i=1;i<=n;i++) {
			String poketmon = bf.readLine();
			map1.put(i+"", poketmon);
			map2.put(poketmon, i+"");
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<m;i++) {
			String s = bf.readLine();
			if(map1.containsKey(s)==true)
				sb.append(map1.get(s)+"\n");
			else sb.append(map2.get(s)+"\n");
		}
		
		bw.write(sb+""); bw.flush();
	}

}
