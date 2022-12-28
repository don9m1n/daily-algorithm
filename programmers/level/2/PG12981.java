package programmers.level2.solve;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

// 영어 끝말잇기
public class PG_12981 {
    public int[] solution(int n, String[] words) {
        int[] answer = {};

        int[] person = new int[n + 1]; // 횟수 카운팅
        person[1]++;
        int num = 2;
        int check = 0;

        for(int i = 1; i < words.length; i++) {
            int lastLeng = words[i-1].length() - 1;
            if(words[i].charAt(0) != words[i-1].charAt(lastLeng) || isCheck(words, words[i], i)) {
                person[num]++;
                check++;
                break;
            }else {
                person[num]++;
                num++;
            }

            // 순서를 다 돌때마다 num을 1로 초기화
            if(num == n+1) num = 1;
        }

        return (check != 0) ? new int[]{num, person[num]} : new int[]{0, 0};
    }

    // 중복 단어가 있는 경우 true, 없는 경우 false;
    static boolean isCheck(String[] words, String word, int range) {
        boolean check = false;

        for(int i = 0; i < range; i++) {
            if(words[i].equals(word)) {
                check = true;
                break;
            }
        }
        return check;
    }

    @Test
    public void test() {
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        int[] result = solution(n, words);

        Assertions.assertThat(result).isEqualTo(new int[]{3, 3});
    }
}