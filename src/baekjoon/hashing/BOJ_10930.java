package baekjoon.hasing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.MessageDigest;

public class BOJ_10930 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // SHA-256(Secure Hash Algorithm): 해시(단방향 알고리즘)로, 암호화 후 평문(복호화)으로 되돌릴 수 없음
        // 가장 보편화 된 방법으로, 사용자의 암호를 암호화하여 저장할 때 사용함
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(br.readLine().getBytes());

        StringBuilder sb = new StringBuilder();
        for(byte b : md.digest()) {
            sb.append(String.format("%02x",b));
        }
        System.out.println(sb.toString());
    }
}
