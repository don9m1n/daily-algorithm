package programmers.level2.solve;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

// 더 맵게(HEAP)
public class PG_42626 {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int num : scoville) {
            pq.add(num);
        }

        int cnt = 0;
        while(pq.peek() < K) {
            if(pq.size() == 1 && pq.peek() < K) {
                cnt = -1;
                break;
            }

            pq.add(pq.poll() + (pq.poll() * 2));
            cnt++;
        }

        return cnt;
    }

    @Test
    public void test() {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 1000;

        int result = solution(scoville, K);

        Assert.assertEquals(2, result);
    }
}