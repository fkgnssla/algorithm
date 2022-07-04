import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.replaceAll("XXXX","AAAA");
        str = str.replaceAll("XX","BB");
        if(str.contains("X"))
            System.out.println(-1);
        else
            System.out.println(str);
    }
}
