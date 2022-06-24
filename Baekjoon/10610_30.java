import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String arr[] = n.split("");
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
			sum+=Integer.parseInt(arr[i]);
		
		if(n.indexOf("0")==-1 || sum%3!=0) {
			System.out.print(-1);
		}
		else {
			Arrays.sort(arr, Collections.reverseOrder());
			System.out.print(String.join("",arr));
		}
	}

}
