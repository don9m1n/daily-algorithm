package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 카드 문자열
public class BOJ_13417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            String[] card = new String[N];

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++) {
                card[j] = st.nextToken();
            }

            StringBuilder sb = new StringBuilder(card[0]);
            for(int k=1; k<card.length; k++) {
                // sb가 card[k]보다 사전순으로 뒤에 오는 경우 글자 맨 앞에 card[k] 추가
                if(sb.toString().compareTo(card[k]) >= 0) {
                    sb.insert(0, card[k]);
                }else {
                    sb.append(card[k]);
                }
            }

            System.out.println(sb.toString());

        }
    }

}