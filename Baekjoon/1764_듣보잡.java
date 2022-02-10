package Silver4;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class s1764 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		String str[] = bf.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		HashMap<String, Integer> map = new HashMap<>(n+m);
		ArrayList<String> list = new ArrayList();
		for(int i=0;i<n+m;i++) {
			String s = bf.readLine();
			if(map.get(s)==null)
				map.put(s, 1);
			else { //듣보잡이 되는 경우
				list.add(s);
			}
		}
		
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		
		bw.write(list.size()+"\n"); bw.flush();
		for(int i=0;i<list.size();i++) {
			bw.write(list.get(i)+"\n"); bw.flush();
		}
	}
  
}
