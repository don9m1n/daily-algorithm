package baekjoon.sweeping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 선 긋기
public class BOJ2170 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        // 가장 작은 시작점부터 오름차순 정렬
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) return o1[1] - o2[1];
                else return o1[0] - o2[0];
            }
        });

        int prevX = arr[0][0]; // 이전 선의 x 좌표
        int prevY = arr[0][1]; // 이전 선의 y 좌표
        int totalLength = prevY - prevX;

        for (int i = 1; i < n; i++) {
            if(prevX <= arr[i][0] && arr[i][1] <= prevY) { // 현재 선의 시작점이 이전 선에 포함된다면
                continue;
            } else if(arr[i][0] < prevY) { // //현재 선의 시작점이 이전 선에 포함된다면
                totalLength += arr[i][1] - prevY;
            } else { // 현재 선과 이전 선이 겹치지 않는다면
                totalLength += arr[i][1] - arr[i][0];
            }
            prevX = arr[i][0];
            prevY = arr[i][1];
            System.out.println(prevX + ", " + prevY);
        }
        System.out.println(totalLength);
    }
}
