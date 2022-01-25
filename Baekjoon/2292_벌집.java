import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	int min=2, max=7; //앞자리 시작, 뒷자리 시작
    	int minP=6, maxP=12; //앞자리 증가폭, 뒷자리 증가폭
    	int count=2;
    	
    	if(n==1) {
    		System.out.print(1); return;
    	}
    	while(true) {
    		if(min<=n && n<=max) break;
    		min+=minP;
    		max+=maxP;
    		minP+=6;
    		maxP+=6;
    		count++;
    	}
    	System.out.print(count);
    }
}
