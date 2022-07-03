package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 그룹 단어 체커
public class BOJ1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (word.length() == 1) { // 1글자의 단어는 무조건 그룹 단어!
                count++;
                continue;
            }

            boolean[] check = new boolean[26];
            check[word.charAt(0) - 97] = true;

            boolean flag = true;
            for (int j = 1; j < word.length(); j++) {
                char curr = word.charAt(j); // 현재 문자
                char prev = word.charAt(j - 1); // 이전 문자

                if (check[curr - 97]) { // 앞에서 나온 문자이고,
                    if(prev != curr && (j - word.indexOf(curr) > 1)) { // 현재문자와 이전문자가 다르고, 간격이 1이상 차이가 난다면!
                        flag = false; // 그룹 단어가 아님!
                        break;
                    }
                }
                check[curr - 97] = true;
            }
            if(flag) count++;
        }
        System.out.println(count);
    }
}
