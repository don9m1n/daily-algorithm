package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 수 묶기
// 못풀었음...
public class BOJ_1744__X {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<N; i++) {
            list.add(i, Integer.parseInt(br.readLine()));
        }

        list.sort(Collections.reverseOrder());

        int sum = 0;
        for(int i=0; i<list.size(); i+=2) {
            int num1 = list.get(i);
            int num2 = list.get(i+1);

            if((num1 * num2) > (num1 + num2)) {
                sum += (num1 * num2);
            }else {
                sum += (num1 + num2);
            }
        }
        System.out.println(sum);



    }
}
