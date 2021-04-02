package baekjoon.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = N;

        for(int i=0; i<N; i++){
            String words = br.readLine();
            boolean[] checker = new boolean[26];

            for(int j=1; j<words.length(); j++){
                if(words.charAt(j-1) != words.charAt(j)) {
                    if(checker[words.charAt(j) - 97]) {
                        count--;
                        break;
                    }

                    checker[words.charAt(j-1) - 97] = true;
                }
            }
        }
        System.out.println(count);
    }
}