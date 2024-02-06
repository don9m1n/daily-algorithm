package progammers.level1;

import java.util.LinkedHashMap;
import java.util.Map;

// 가장 많이 받은 선물
public class PG_258712 {
    public static void main(String[] args) {
        System.out.println(solution(
                new String[]{"muzi", "ryan", "frodo", "neo"},
                new String[]{"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"}
        ));
    }

    static int solution(String[] friends, String[] gifts) {

        Map<String, Integer> giftPoint = new LinkedHashMap<>();
        Map<String, Map<String, Integer>> history = new LinkedHashMap<>();
        Map<String, Integer> result = new LinkedHashMap<>();

        for (String f : friends) {
            giftPoint.put(f, 0);
            history.put(f, new LinkedHashMap<>());
            result.put(f, 0);
        }

        for (String gift : gifts) {
            String[] split = gift.split(" ");
            String sender = split[0];
            String receiver = split[1];

            giftPoint.put(sender, giftPoint.getOrDefault(sender, 0) + 1);
            giftPoint.put(receiver, giftPoint.getOrDefault(receiver, 0) - 1);

            Map<String, Integer> senderHistory = history.get(sender);
            senderHistory.put(receiver, senderHistory.getOrDefault(receiver, 0) + 1);
        }

        for (int i = 0; i < friends.length - 1; i++) {
            String sender = friends[i];
            Map<String, Integer> senderHistory = history.get(sender);

            for (int j = i + 1; j < friends.length; j++) {
                String receiver = friends[j];
                Map<String, Integer> receiverHistory = history.get(receiver);

                int senderCount = senderHistory.getOrDefault(receiver, 0);
                int receiverCount = receiverHistory.getOrDefault(sender, 0);

                if (senderCount > receiverCount) {
                    result.put(sender, result.getOrDefault(sender, 0) + 1);
                } else if (senderCount < receiverCount) {
                    result.put(receiver, result.getOrDefault(receiver, 0) + 1);
                } else {
                    int senderPoint = giftPoint.get(sender);
                    int receiverPoint = giftPoint.get(receiver);

                    if (senderPoint > receiverPoint) {
                        result.put(sender, result.getOrDefault(sender, 0) + 1);
                    } else if (senderPoint < receiverPoint) {
                        result.put(receiver, result.getOrDefault(receiver, 0) + 1);
                    }
                }
            }
        }

        int max = 0;
        for (String key : result.keySet()) {
            max = Math.max(max, result.get(key));
        }

        return max;
    }
}
