package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 센서
public class BOJ2212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        Set<Integer> set = new LinkedHashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        Integer[] sensor = set.toArray(new Integer[0]);
        Arrays.sort(sensor);

        int[] diff = new int[sensor.length - 1];
        for (int i = 0; i < diff.length; i++) {
            diff[i] = sensor[i + 1] - sensor[i];
        }
        Arrays.sort(diff);

        int sum = 0;
        for (int i = 0; i < sensor.length - k; i++) {
            sum += diff[i];
        }

        System.out.println(sum);
    }
}
