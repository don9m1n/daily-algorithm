package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// 다이얼
public class BOJ5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] word = br.readLine().split("");

        solution1(word); // map
        solution2(word); // switch
    }

    private static void solution2(String[] word) {
        int sum = 0;
        for (int i = 0; i < word.length; i++) {
            String w = word[i];
            switch (w) {
                case "A": case "B": case "C":
                    sum += 3;
                    break;
                case "D": case "E": case "F":
                    sum += 4;
                    break;
                case "G": case "H": case "I":
                    sum += 5;
                    break;
                case "J": case "K": case "L":
                    sum += 6;
                    break;
                case "M": case "N": case "O":
                    sum += 7;
                    break;
                case "P": case "Q": case "R": case "S":
                    sum += 8;
                    break;
                case "T": case "U": case "V":
                    sum += 9;
                    break;
                case "W": case "X": case "Y": case "Z":
                    sum += 10;
                    break;
            }
        }
        System.out.println(sum);
    }

    private static void solution1(String[] word) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("ABC", 2);
        map.put("DEF", 3);
        map.put("GHI", 4);
        map.put("JKL", 5);
        map.put("MNO", 6);
        map.put("PQRS", 7);
        map.put("TUV", 8);
        map.put("WXYZ", 9);

        int sum = 0;
        for (String w : word) {
            for (String key : map.keySet()) {
                if (key.contains(w)) {
                    sum += map.get(key) + 1;
                }
            }
        }
        System.out.println(sum);
    }
}
