package Silver5;

import java.util.Scanner;
import java.util.Vector;

public class s1158 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();	//사람수
		int k=s.nextInt();	//사람이 제거되는 순서
		int index=0;
		int count, i;
		int arr[] = new int[n];	//사람이 있다면 1 제거됐다면 0
		Vector<Integer> v = new Vector<Integer>(n);
		
		for(i=0;i<n;i++) arr[i]=1;
		//벡터의 크기와 사람의 수가 같다면 탈출
		while(v.size()!=n) {
			count=0;
			//제거할 사람을 찾는다
			while(count!=k) {
				if(index>=n) index=index%n;
				if(arr[index]==1)count++;
				index++;
			}
			index--;
			arr[index]=0;
			v.add(index+1);	//인덱스값이 0이면 1번이니까 +1 한것
		}
		
		if(n==1 && k==1) System.out.print("<"+v.get(0)+">");
		else {
			System.out.print("<"+v.get(0)+",");
			for(i=1;i<v.size()-1;i++) {
				System.out.print(" "+v.get(i)+",");
			}
			System.out.print(" "+v.get(i)+">");
		}
	}
}
