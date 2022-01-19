package Silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class s11650 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		xy arr[] = new xy[n];
		
		for(int i=0;i<n;i++) {
			String str[] = bf.readLine().split(" ");
			arr[i] = new xy(Integer.parseInt(str[0]) , Integer.parseInt(str[1]));
		}
		
		Arrays.sort(arr, new Comparator<xy>() {
			@Override
			public int compare(xy o1, xy o2) {
				if(o1.x<o2.x) return -1;
				else if(o1.x>o2.x) return 1;
				else if(o1.x==o2.x && o1.y<o2.y) return -1;
				else return 1;
			}
		});
		
		for(int i=0;i<n;i++) {
			bw.write(arr[i].toString()); bw.flush();
		}
		bw.close(); bf.close();
	}
}
class xy {
	int x;
	int y;
	public xy(int x, int y) {
		this.x=x; this.y =y;
	}
	@Override
	public String toString() {
		return x + " " + y + "\n";
	}
}
