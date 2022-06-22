import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long S = sc.nextLong();
		
		long n=0;
		long k=0;
		long i=1;
		
		while(true) {
			if(k+i>S) {
				break;
			}
			k+=i;
			i++;
			n++;
		}
		
		System.out.print(n);
	}
}
