package Silver4;

import java.io.*;
import java.util.Stack;

public class s4949 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	

		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack();
		while(true) {
			boolean flag=false;
			String str = bf.readLine();
			if(str.equals(".")==true) break;
		
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i) == '(' || str.charAt(i) == '[')
					stack.add(str.charAt(i));
				else if(str.charAt(i) == ')' || str.charAt(i) == ']') {
					
					if(!stack.isEmpty()) {
						char c = stack.pop();
						if((c == '(' && str.charAt(i) == ']')
								|| (c == '[' && str.charAt(i) == ')')) {
							flag=true; break;
						}
					}
					else {
						flag=true; break;
					}
				}
			}
			
			if(!flag) { //반복문에서 걸린 것이 없는 경우
				if(stack.isEmpty())
					sb.append("yes"+"\n");
				else //﻿')' or ']'의 갯수가 '(' or '['의 갯수보다 적은 경우
				    sb.append("no"+"\n");
			}
			else sb.append("no"+"\n");
			
			stack.clear();
		}
		
		bw.write(sb+""); bw.flush();
	}

}
