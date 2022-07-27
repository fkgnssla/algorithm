import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        //O(n)
        ArrayList<Integer> input = new ArrayList(n);
        for(int i=0;i<n;i++) {
            input.add(Integer.parseInt(st.nextToken()));
        }

        HashSet<Integer> inputSet = new HashSet<>(input); //중복값 제거
        Integer[] newArr = inputSet.toArray(new Integer[0]);
        Arrays.sort(newArr);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<inputSet.size();i++) {
            map.put(newArr[i],i);
        }

        //O(n)
        for(int i=0;i<n;i++) {
            sb.append(map.get(input.get(i)) + " ");
        }
        bw.write(sb+""); bw.flush();
       
    }
}
