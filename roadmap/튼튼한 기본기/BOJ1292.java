package roadmap.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 쉽게 푸는 문제
public class BOJ1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        int index = 1;
        while(list.size() < 1000) {
            for (int i = 0; i < index; i++) {
                list.add(index);
            }
            index++;
        }

        int sum = 0;
        for (int i = start - 1; i < end; i++) {
            sum += list.get(i);
        }

        System.out.println(sum);
    }
}
