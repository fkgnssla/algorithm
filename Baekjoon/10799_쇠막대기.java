package Silver3;

import java.util.Scanner;
import java.util.Stack;

public class s10799 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = sc.nextLine().split("");
		Stack stack = new Stack();
		int count=0;
		for(int i=0;i<str.length;i++) {
			if(str[i].equals(")")) {
				if(str[i-1].equals(")")) { //막대기 끝
					stack.remove("("); 
					count+=1;
				}
				else { //레이저
					stack.remove("(");
					count+=stack.size();
				}
			}
			else 
				stack.add(str[i]);
		}
		
		System.out.print(count);
	}
}
