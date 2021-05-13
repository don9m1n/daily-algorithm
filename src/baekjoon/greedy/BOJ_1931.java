package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] room = new int[N][2];

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            room[i][0] = Integer.parseInt(st.nextToken());
            room[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(room, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 종료시간이 같은 경우 시작 시간  오름차순 정렬
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int cnt = 0;
        int end_time = 0;

        for(int i=0; i<N; i++) {
            if(room[i][0] >= end_time) {
                end_time = room[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);

        for(int i=0; i<room.length; i++) {
            for(int j=0; j<room[i].length; j++) {
                System.out.print(room[i][j] + " ");
            }
            System.out.println();
        }

        /*
        int cnt = 1;
        int i = 0;
        while(i<N) {
            int end = room[i][1];

            int j;
            for(j=i+1; j<room.length; j++) {
                int start = room[j][0];

                // 다음 회의 시작 시간이 이전 회의 종료 시각보다 같거나 큰 경우
                if(start >= end) {
                    cnt++;
                    System.out.println("end: " + end + ", start: " + start);
                    System.out.println("====================");
                    System.out.println("(" + room[i][0] + ", " + end + ")");
                    System.out.println("====================");
                    break;
                }
            }
            i = j;
        }

        System.out.println(cnt);
        */
    }
}