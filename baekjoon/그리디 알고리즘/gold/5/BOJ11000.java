package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 강의실 배정 (Priority Queue!!)
public class BOJ_11000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }else {
                    return o1[0] - o2[0];
                }
            }
        });

        /*
            Priority Queue: 입력 순서대로 출력되지않고, 우선순위가 높은 순서대로 요소를 출력하는 자료구조
            - Method
            (1) add Element: add(), offer()
            (2) remove Element: remove(), poll(), *clear() 얘는 초기화*
            (3) print Element: peek() -> 값을 꺼내지는 않고 출력만 하는 메서드

         */
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(arr[0][1]); // Queue 에 첫 번째 강의 종료시각 삽입

        for(int i=1; i<arr.length; i++) {
            if(pq.peek() <= arr[i][0]) {
                pq.poll();
            }

            pq.add(arr[i][1]);
            System.out.println(pq.toString());
        }
        System.out.println(pq.size());
    }
}