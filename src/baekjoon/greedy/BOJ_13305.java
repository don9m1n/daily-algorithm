package baekjoon.greedy.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 주유소
public class BOJ_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] street = new int[N-1];
        int[] oilPrice = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < street.length; i++) {
            street[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < oilPrice.length; i++) {
            oilPrice[i] = Integer.parseInt(st.nextToken());
        }

        long totalPrice = 0; // 총 금액
        long minCost = oilPrice[0]; // 최소 금액
        for(int i = 0; i < N - 1; i++) {
           if(oilPrice[i] < minCost) {
                minCost = oilPrice[i];
           }

           totalPrice += (minCost * street[i]);
        }
        System.out.println(totalPrice);
    }
}