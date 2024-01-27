import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Deque<Integer> q1 = new ArrayDeque<>();
        Deque<Integer> q2 = new ArrayDeque<>();

        int sumLen = queue1.length + queue2.length;
        long sum1 = 0;
        long sum2 = 0;

        for (int i = 0; i < queue1.length; i++) {
            q1.addLast(queue1[i]);
            sum1 += queue1[i];
        }
        for (int i = 0; i < queue2.length; i++) {
            q2.addLast(queue2[i]);
            sum2 += queue2[i];
        }

        if ((sum1 + sum2) % 2 != 0) return -1;
        if (sum1 == sum2) return 0;

        long half = (sum1 + sum2) / 2;
        int idx = 0;

        while (true) {
            idx++;
            if (sum1 < sum2) {
                int a = q2.pollFirst();
                sum2 -= a;
                sum1 += a;
                q1.addLast(a);
            } else {
                int a = q1.pollFirst();
                sum1 -= a;
                sum2 += a;
                q2.addLast(a);
            }

            if (sum1 == half && sum2 == half) break;
            if (idx > sumLen * 2) return -1;
        }

        return idx;
    }
}
