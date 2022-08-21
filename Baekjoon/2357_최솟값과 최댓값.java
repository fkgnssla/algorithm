import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];
        SegmentTree segmentTree = new SegmentTree(n);

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        segmentTree.minTree(arr, 1, 0, n-1);
        segmentTree.maxTree(arr, 1, 0, n-1);
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
            
            //최소값, 최대값 초기화
            segmentTree.min = Integer.MAX_VALUE;
            segmentTree.max = Integer.MIN_VALUE;
            
            //범위에 맞는 최소값 찾기
            segmentTree.query(1,0,n-1,left-1, right-1,0);
            //범위에 맞는 최대값 찾기
            segmentTree.query(1,0,n-1,left-1, right-1,1);
            sb.append(segmentTree.min + " " + segmentTree.max + "\n");
        }
        bw.write(sb+""); bw.flush();
    }
}
class SegmentTree {
    int tree[][];
    int treeSize;
    int min,max;
    public SegmentTree(int size) {
        int h = (int) Math.ceil(Math.log(size)/ Math.log(2));
        treeSize = (int)Math.pow(2,h+1);
        tree = new int[treeSize][2];
    }

    public int minTree(int arr[], int node, int start, int end) {
        if(start == end) {
            return tree[node][0] = tree[node][1] = arr[start];
        }
        return tree[node][0] = Math.min(minTree(arr, node*2, start, (start+end)/2),
                minTree(arr, node*2+1, (start+end)/2+1, end));
    }
    public int maxTree(int arr[], int node, int start, int end) {
        if(start == end) {
            return tree[node][0] = tree[node][1] = arr[start];
        }
        return tree[node][1] = Math.max(maxTree(arr, node*2, start, (start+end)/2),
                maxTree(arr, node*2+1, (start+end)/2+1, end));
    }

	//범위에 해당하는 최소값 또는 최대값 찾는 메서드
    public void query(int node, int start, int end, int left, int right, int type) {
        if(left>end || right<start) return;
        else if (left<=start && end<=right) {
            if(type==0) min = Math.min(min, tree[node][0]); //최소값
            else max = Math.max(max, tree[node][1]); //최대값
            return;
        }
        query(node*2, start, (start+end)/2, left, right, type);
        query(node*2+1, (start+end)/2+1, end, left, right, type);
    }
}
