package Silver5;

import java.io.*;

public class s22351 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		int i,j;
		int length = str.length();
		
		//예외처리하기 어려워서 걍 조건문으로 빼놓음 (시작값O, 끝값X => But 99 100, 9 10 으로 출력되어야함)
		if(length==5) { //99100
			if(str.substring(0,2).equals("99") && str.substring(2,5).equals("100")) {
				System.out.print(99+" "+100); return;
			}
		}
		if(length==3) { //910
			if(str.substring(0,1).equals("9") && str.substring(1,3).equals("10")) {
				System.out.print(9+" "+10);	return;
			}
		}
		
		
		for(i=3;i>0;i--) {
			if(length<i*2) continue; //중요
			int a,b;
			a = Integer.parseInt(str.substring(0,i));
			b = Integer.parseInt(str.substring(i,i*2));
			if(b-a == 1) break;
			
			if(i!=3 && length!=i*2) {  //중요
				b = Integer.parseInt(str.substring(i,i*2+1));
				if(b-a == 1) break;
			}
		}
		
		for(j=3;j>0;j--) {
			if(length<j*2) continue; //중요
			int a,b;
			a = Integer.parseInt(str.substring(length-(j*2),length-j));
			b = Integer.parseInt(str.substring(length-j,length));
			if(b-a == 1) break;
			
			if(j!=1 && length!=j*2) { //중요
				a = Integer.parseInt(str.substring(length-(j*2)+1,length-j));
				if(b-a == 1) break;
			}
		}
		
		if((i==0 && j==0) || (i!=0 && j==0)|| (i==0 && j!=0)) // 1,2,3,4,5,.. || 102,203,...(시작값O, 끝값X) ||101,201,301,...(시작값X, 끝값O)
			System.out.print(str+" "+str);
		else {
			System.out.print(str.substring(0,i)+" "+str.substring(length-j,length));
		}
	}

}
