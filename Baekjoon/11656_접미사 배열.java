package Silver4;

import java.io.*;
import java.util.Arrays;

public class s11656 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	

		String word = bf.readLine();
		int length = word.length();
		String words[] = new String[length];
		
		for(int i=0;i<length;i++) 
			words[i] = word.substring(i);
		
		Arrays.sort(words);
		
		for(int i=0;i<length;i++) {
			bw.write(words[i]+"\n"); bw.flush();
		}
	}

}
