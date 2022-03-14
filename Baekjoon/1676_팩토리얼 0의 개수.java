package Silver4;

import java.math.BigInteger;
import java.util.*;

class s1676 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		BigInteger big = new BigInteger("1");
		BigInteger t;
		while(n!=0) {
			t = new BigInteger(n+"");
			big = big.multiply(t);
			n--;
		}
		
		t = new BigInteger("10");
		while(true) {
			BigInteger re = big.remainder(t);
			big = big.divide(t);
			
			if(re.intValue() == 0)
				n++;
			else break;
		}
		System.out.println(n);
	}
}
