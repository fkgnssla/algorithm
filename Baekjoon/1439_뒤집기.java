import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n=0;
		
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i) != s.charAt(i+1))
				n++;
		}
		
		if(n%2==0) n/=2;
		else n=(n/2)+1;
		System.out.print(n);
	}
}
