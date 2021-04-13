package baekjoon.level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Set<String> words = new HashSet<String>();

        for(int i=0; i<N; i++){
            words.add(br.readLine());
        }

        List<String> filterWord = new ArrayList<String>(words);

        filterWord.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });

        for(String str : filterWord) {
            System.out.println(str);
        }
    }
}
