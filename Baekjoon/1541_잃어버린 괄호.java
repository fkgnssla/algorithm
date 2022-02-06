package Silver2;

import java.util.Scanner;

public class s1541 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = sc.nextLine().split("\\-");
		String atr[];
		int sum=0;
		
		//수식의 첫 번째 수의 기호가 '-'일 때 
		if(str[0].equals("")==true) {
			for(int i=1;i<str.length;i++) {
				atr = str[i].split("\\+");
				for(int j=0;j<atr.length;j++) {
					sum-=Integer.parseInt(atr[j]);
				}
			}
		}
		//수식의 첫 번째 수의 기호가 '+'일 때 
		else {
			//'-'가 나오기전까지 더해준다
			atr = str[0].split("\\+");
			for(int i=0;i<atr.length;i++) {
				sum+=Integer.parseInt(atr[i]);
			}
			
			for(int i=1;i<str.length;i++) {
				atr = str[i].split("\\+");
				for(int j=0;j<atr.length;j++) {
					sum-=Integer.parseInt(atr[j]);
				}
			}
		}	
		
		System.out.print(sum);

	}

}
