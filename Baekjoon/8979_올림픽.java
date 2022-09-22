import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int arr[][] = new int[n][4];
        int g=0,s=0,m=0;
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken()); //국가번호
            arr[i][1] = Integer.parseInt(st.nextToken()); //금
            arr[i][2] = Integer.parseInt(st.nextToken()); //은
            arr[i][3] = Integer.parseInt(st.nextToken()); //동
            if(arr[i][0] == k) {
                g = arr[i][1];
                s = arr[i][2];
                m = arr[i][3];
            }
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]<o2[1]) return 1;
                else if (o1[1] == o2[1]) { //금메달 수 동일
                    if(o1[2]<o2[2]) return 1;
                    else if(o1[2] == o2[2]) { //은메달 수 동일
                        if(o1[3]<o2[3]) return 1;
                        else if (o1[3] == o2[3]) return 0; //동메달 수 동일
                        else return -1;
                    }
                    else return -1;
                }
                else return -1;
            }
        });

        for(int i=0;i<n;i++) {
            if (arr[i][1] == g && arr[i][2] == s && arr[i][3] == m) {
                System.out.println(i+1);
                break;
            }
        }
    }
}
