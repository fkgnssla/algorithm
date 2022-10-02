import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int blueN=0; //맨 왼쪽 또는 맨 오른쪽에 뭉쳐있지 않은 파란공의 개수
        int redN=0; //맨 왼쪽 또는 맨 오른쪽에 뭉쳐있지 않은 빨간공의 개수
        int acum=0; //누적값

        //오른쪽으로 모으기
        if(str.charAt(0) =='B') blueN=1;
        else redN=1;
        for(int i=1;i<n;i++) {
            if(str.charAt(i) =='B') {
                if(str.charAt(i-1) == 'B') acum++; //연속된 B
                else { //끊긴경우
                    redN+=acum;
                    acum=1;
                }
            }else {
                if(str.charAt(i-1) == 'R') acum++; //연속된 R
                else { //끊긴경우
                    blueN+=acum;
                    acum=1;
                }
            }
        }
        int n1; //오른쪽으로 모았을 때 최소횟수
        if(blueN<=redN) n1=blueN;
        else n1=redN;

        //왼쪽으로 모으기
        blueN = redN = acum = 0;
        if(str.charAt(n-1) =='B') blueN=1;
        else redN=1;
        for(int i=n-2;i>=0;i--) {
            if(str.charAt(i) =='B') {
                if(str.charAt(i+1) == 'B') acum++; //연속된 B
                else { //끊긴경우
                    redN+=acum;
                    acum=1;
                }
            }else {
                if(str.charAt(i+1) == 'R') acum++; //연속된 R
                else { //끊긴경우
                    blueN+=acum;
                    acum=1;
                }
            }
        }
        int n2; //왼쪽으로 모았을 때 최소횟수
        if(blueN<=redN) n2=blueN;
        else n2=redN;

        if(n1>n2) System.out.println(n2);
        else System.out.println(n1);
    }
}
