package Silver5;

import java.util.Scanner;

public class s1436{
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	int sum=666;
    	
    	while(true) {
    		String str = sum+"";
    		if(str.contains("666")) {
    			n--;
    			if(n==0) break;
    		}
    		sum++;
    	}
    	System.out.print(sum);
    }
}
