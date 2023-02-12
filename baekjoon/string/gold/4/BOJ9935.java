package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 폭발
public class BOJ9935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String boom = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));

            if (sb.length() >= boom.length()) {
                boolean flag = true;
                for (int j = 0; j < boom.length(); j++) {
                    char ch1 = sb.charAt(sb.length() - boom.length() + j);
                    char ch2 = boom.charAt(j);

                    if (ch1 != ch2) {
                        flag = false;
                        break;
                    }
                }

                if(flag) {
                    sb.delete(sb.length() - boom.length(), sb.length());
                }
            }
        }
        System.out.println(sb.length() > 0 ? sb : "FRULA");
    }
}
