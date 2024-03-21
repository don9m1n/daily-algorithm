package baekjoon.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1
public class BOJ_4375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = br.readLine()) != null) { // EOF: End Of File

            int num = Integer.parseInt(line);
            int mod = 0;

            for(int i = 1; ; i++){
                mod = (mod * 10 + 1) % num;

                if(mod == 0) {
                    System.out.println(i);
                    break;
                }
            }

        }
    }
}
