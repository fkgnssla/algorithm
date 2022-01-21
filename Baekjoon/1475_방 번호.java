package Silver5;

import java.util.Scanner;

public class s1475 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str[] = s.nextLine().split("");
		int arr[] = new int[10];
		
		for(int i=0;i<str.length;i++) {
			arr[Integer.parseInt(str[i])]++; 
		}
		
		int count=0;
		switch(arr[6]+arr[9]) {
			case 1: case 2: count = 1; break;
			case 3: case 4: count = 2; break;
			case 5: case 6: count = 3; break;
			case 7: case 8: count = 4; break;
		}
		
		for(int i=0;i<10;i++) {
			//i!=6 && i!=9 작성하지 않아 처음에 틀림
			if(arr[i]>count && i!=6 && i!=9) 
				count=arr[i];
		}
		System.out.print(count);
	}

}
