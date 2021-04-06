package baekjoon.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 영화감독 숌
// 종말의 숫자: 6이 최소한 3번 이상 연속해서 들어가는 숫자
/*
 알아낸 것....
 1. 6000번대 숫자를 10으로 나누면 몫이 666 -> 1666 -> 2666 .... 식으로 전개
 2. 6000번대 숫자는 6660 ~ 6669 순서대로 출력되게 만들어야함
 3. 그 외의 숫자는 1000씩 더하면 됨 ???
 */
public class BOJ_1436O {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int num = 666; // 종말의 숫자를 저장할 변수
        int count = 1;

        // 1. 브루트 포스를 이용한 방법 (무식한 힘)
        while(count != N){
            num++;

            // int -> String으로 변환하여 666이 들어가있는지 검사
            if(String.valueOf(num).contains("666")){
                count++;
            }
        }
        System.out.println(num);
    }
}