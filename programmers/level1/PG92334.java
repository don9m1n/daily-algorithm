package programmers.level1.success;

import java.util.*;

// 신고 결과 받기
public class PG92334 {

    public static void main(String[] args) {
        int[] solution = solution(new String[]{"muzi", "frodo", "apeach", "neo"},
                new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}, 2);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(String[] idList, String[] report, int k) {

        Map<String, Set<String>> reportedCountMap = new LinkedHashMap<>(); // 해당 유저를 신고한 신고자들 저장
        Map<String, Integer> mailCountMap = new LinkedHashMap<>(); // 유저별 받은 정지메일 개수
        int[] result = new int[idList.length];

        for (String user : idList) {
            reportedCountMap.put(user, new HashSet<>());
            mailCountMap.put(user, 0);
        }

        for (String r : report) {
            String reporter = r.split(" ")[0];
            String reported = r.split(" ")[1];
            reportedCountMap.get(reported).add(reporter);
        }

        for (String user : reportedCountMap.keySet()) {
            if (reportedCountMap.get(user).size() >= k) {
                for (String reportUser : reportedCountMap.get(user)) {
                    mailCountMap.put(reportUser, mailCountMap.get(reportUser) + 1);
                }
            }
        }

        for (int i = 0; i < idList.length; i++) {
            result[i] = mailCountMap.get(idList[i]);
        }

        return result;
    }
}
