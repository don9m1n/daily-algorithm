package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 크로아티아 알파벳
public class BOJ2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String word = br.readLine();

        for (String c : croatia) {
            word = word.replaceAll(c, "X");
        }
        System.out.println(word.length());
    }
}
