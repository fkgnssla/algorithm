import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();

        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            String s = sc.nextLine();
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else {
                map.put(s,1);
            }
        }
        
        int max=0;
        String maxStr="zzz";
        for(String s : map.keySet()) {
            if(map.get(s)>max) {
                max=map.get(s);
                maxStr=s;
            }
            else if(map.get(s)==max) {
                if(s.compareTo(maxStr)<0) {
                    maxStr=s;
                }
            }
        }
        System.out.println(maxStr);
    }
}
