package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 폴리오미노
public class BOJ_1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String result = "";

        if(str.equals("X")) {
            System.out.println(-1);
            return;
        }

        int cnt = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'X') {
                cnt++;
                if(i == str.length() - 1) {
                    if(cnt % 2 != 0) {
                        System.out.println(-1);
                        return;
                    }else {
                        while(cnt > 0) {
                            if(cnt >= 4) {
                                result += "AAAA";
                                cnt -= 4;
                            }else {
                                result += "BB";
                                cnt -= 2;
                            }
                        }
                    }
                }
            }else if(str.charAt(i) == '.') {
                if(cnt % 2 != 0) {
                    System.out.println(-1);
                    return;
                }else {
                    while(cnt > 0) {
                        if(cnt >= 4) {
                            result += "AAAA";
                            cnt -= 4;
                        }else {
                            result += "BB";
                            cnt -= 2;
                        }
                    }
                    result += '.';
                    cnt = 0;
                }
            }
        }
        System.out.println(result);
    }
}
