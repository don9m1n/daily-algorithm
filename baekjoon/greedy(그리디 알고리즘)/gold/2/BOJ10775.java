package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 공항
public class BOJ10775 {
    static int[] gate;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int G = Integer.parseInt(br.readLine());
        gate = new int[G + 1];
        for (int i = 1; i <= G; i++) {
            gate[i] = i;
        }

        int P = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < P; i++) {
            int g = Integer.parseInt(br.readLine());
            int emptyGate = find(g);

            if (emptyGate == 0) {
                break;
            }

            count++;
            union(emptyGate, emptyGate - 1);
        }

        System.out.println(count);
    }

    public static int find(int x) {
        if (x == gate[x]) {
            return x;
        }

        return gate[x] = find(gate[x]);
    }

    public static void union(int x, int y) {
        x = find(x);
        y = find(y);

        if (x != y) {
            gate[x] = y;
        }
    }
}
