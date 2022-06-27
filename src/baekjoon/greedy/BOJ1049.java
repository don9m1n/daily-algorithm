package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 기타줄
public class BOJ1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] price = new int[m][2];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            price[i][0] = Integer.parseInt(st.nextToken());
            price[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(price, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });

        int min = 10000;
        for (int i = 0; i < m; i++) {
            int price1 = ((n / 6) + 1) * price[i][0];// 전부 패키지로 구매하는 경우
            int price2 = (n / 6) * price[i][0] + (n % 6) * price[m - i - 1][1];// 패키지로 구매 후 남은 개수는 낱개로 구매!
            int price3 = n * price[m - i - 1][1]; // 전부 낱개로 구매하는 경우

            min = Math.min(min, Math.min(price1, Math.min(price2, price3)));
        }
        System.out.println(min);
    }
}
