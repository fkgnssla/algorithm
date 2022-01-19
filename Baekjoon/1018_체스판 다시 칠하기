package Silver5;

import java.util.Scanner;

public class s1018 {

	//잘못 칠해진 정사각형의 개수를 반환하는 함수
	static int searchWrong(char arr[][],int i,int j) {
		int count1=0, count2=0;
		int maxN=i+8,maxM=j+8;	//i,j를 기준으로 각각 행의 끝, 열의 끝
		int a=i,b=j;	//i,j값 플래그
		
		//체스판의 시작점이 하얀색이라고 가정했을 때 수정해야할 개수 세기
		if((i+j)%2==0) {		//체스판의 시작점의 좌표의 합이 짝수이면
			for(;i<maxN;i++) {
				for(;j<maxM;j++) {
					if((i+j)%2==0 && arr[i][j]!='W') //흰색이어야하는데 검은색이면
						count1++;
					if((i+j)%2!=0 && arr[i][j]!='B') //검은색이어야하는데 흰색이면
						count1++;
				}
				j=b;	//j값 초기화
			}
		}
		else {				//체스판의 시작점의 좌표의 합이 홀수이면
			for(;i<maxN;i++) {
				for(;j<maxM;j++) {
					if((i+j)%2==0 && arr[i][j]!='B') //검은색이어야하는데 흰색이면
						count1++;
					if((i+j)%2!=0 && arr[i][j]!='W') //흰색이어야하는데 검은색이면
						count1++;
				}
				j=b;
			}
		}
		
		i=a;j=b;	//i,j값 초기화(시작점이 검은색이라 가정 할 경우 다시 세기위함)
		
		//체스판의 시작점이 검은색이라고 가정했을 때 수정해야할 개수 세기
		if((i+j)%2==0) {		//체스판의 시작점의 좌표의 합이 짝수이면
			for(;i<maxN;i++) {
				for(;j<maxM;j++) {
					if((i+j)%2==0 && arr[i][j]!='B') //검은색이어야하는데 흰색이면
						count2++;
					if((i+j)%2!=0 && arr[i][j]!='W') //흰색이어야하는데 검은색이면
						count2++;
				}
				j=b;
			}
		}
		else {					//체스판의 시작점의 좌표의 합이 홀수이면
			for(;i<maxN;i++) {
				for(;j<maxM;j++) {
					if((i+j)%2==0 && arr[i][j]!='W') //흰색이어야하는데 검은색이면
						count2++;
					if((i+j)%2!=0 && arr[i][j]!='B') //검은색이어야하는데 흰색이면
						count2++;
				}
				j=b;
			}
		}
		
		//수정할 개수가 적은 것 반환
		if(count1>count2) return count2;
		else return count1;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,m;	//각각 행,열
		int i=0,j=0;
		n=s.nextInt(); m=s.nextInt();
		char arr[][]= new char[n][m];
		//체스판 입력
		for(i=0;i<n;i++) {
			String str = s.next();
			for(j=0;j<m;j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		int count=0; //다시 칠해야하는 정사각형 개수
		int min=65;	//다시 칠해야하는 정사각형 개수의 최솟값
		i=j=0;
		
		//체스판을 잘라보면서 다시 칠해야하는 정사각형의 개수의 최솟값을 구한다
		while(i+8<=n) {		
			while(j+8<=m) {
				//i,j가 체스판의 시작점일 경우 해당하는 체스판의 수정해야할 개수 반환받기
				count = searchWrong(arr,i,j);
				if(min>count) min=count;
				j++;
			}
			i++;
			j=0;
		}
		System.out.print(min);
	}
}
