package programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class 완주하지_못한_선수 {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> hm = new HashMap<String, Integer>();

        for(String player : participant) {
            // getOrDefault(key, default value): 찾는 키가 존재하면 key의 value를 출력하고, 없으면 default value 출력!
            hm.put(player, hm.getOrDefault(player, 0) + 1);
        }

        for(String player : completion) {
            hm.put(player, hm.get(player) - 1);
        }

        for(String key : hm.keySet()) {
            if(hm.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }
}