package programmers.level2;

import java.util.PriorityQueue;

// 더 맵게 [힙 정렬]
public class PG42626 {

    public static void main(String[] args) {
        int solution = solution(new int[]{1, 2, 3, 9, 10, 12}, 200);
        System.out.println("solution = " + solution);
    }

    public static int solution(int[] scoville, int K) {

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int s : scoville) heap.add(s);

        int count = 0;
        while (heap.size() > 1 && heap.peek() < K) {
            int first = heap.poll();
            int second = heap.poll();

            int newFood = first + (second * 2);
            heap.add(newFood);
            count++;
        }

        if(heap.size() == 1 && heap.peek() < K) {
            count = -1;
        }

        return count;
    }
}
