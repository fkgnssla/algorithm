package Silver4;

import java.io.*;
import java.util.ArrayList;

public class s1021 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str[] = bf.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		ArrayList list = new ArrayList();

		for(int i=1;i<=n;i++)
			list.add(i);
		str = bf.readLine().split(" "); //뽑을 원소

		int sum=0;
		for(int i=0;i<m;i++) {
			int size = list.size();
			
			int index = list.indexOf(Integer.parseInt(str[i]));

			if(size/2>=index) { //﻿중간보다 앞에 있을 경우(중간포함) => 왼쪽 회전이 최소연산
				for(int j=0;j<=index;j++) {
					int ab = (int) list.remove(0); //자동 언박싱 안 되나?
					if(ab!=Integer.parseInt(str[i])) {
						list.add(ab); sum++; //뽑으려는 원소는 회전하지 않고 제거만 되기에 if문에 들어있어야 한다.
					}
				}
			}
			else { //﻿중간보다 뒤에 있을 경우 => 오른쪽 회전이 최소연산
				for(int j=0;j<size-index;j++) {
					int ab = (int) list.remove(size-1);
					if(ab!=Integer.parseInt(str[i])) 
						list.add(0, ab); 
					sum++; //뽑으려는 원소도 회전하기에 36L의 if문에 들어가면 안 된다.
				}
			}
		}
		System.out.print(sum);
	
	}

}
