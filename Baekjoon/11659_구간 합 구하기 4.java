package com.company;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String []input = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(input[0]); int m = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int num[] = new int[n+1];
        for(int i=0;i<n;i++) {
            int k = Integer.parseInt(input[i]);
            num[i+1] = k+num[i];
        }

        String w = "";
        for(int i=0;i<m;i++) {
            input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            sb.append((num[y]-num[x-1])+"\n");
        }
        bw.write(sb+""); bw.flush();
    }
}


