import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] srr = {'U','C','P','C'};
        int srrIndex = 0;
        String str = br.readLine();

        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) == srr[srrIndex]) {
                srrIndex++;
                if(srrIndex == 4) {
                    System.out.println("I love UCPC");
                    return;
                }
            }
        }
        System.out.println("I hate UCPC");
    }
}
