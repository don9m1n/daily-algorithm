package programmers.level2;

import java.util.*;

// 오픈채팅방 [2019 KAKAO BLIND RECRUITMENT]
public class PG42888 {

    public static void main(String[] args) {
        String[] solution = solution(new String[]{
                "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"});
        System.out.println("solution = " + Arrays.toString(solution));
    }

    public static String[] solution(String[] record) {

        Map<String, String> users = new HashMap<>(); // 유저 정보 [유저아이디, 닉네임]
        List<String> messages = new ArrayList<>(); // 메세지

        for (int i = 0; i < record.length; i++) {
            String[] command = record[i].split(" ");

            if (command[0].equals("Enter")) {
                messages.add(command[1] + "님이 들어왔습니다.");
                users.put(command[1], command[2]);
            } else if (command[0].equals("Leave")) {
                messages.add(command[1] + "님이 나갔습니다.");
            } else if (command[0].equals("Change")) {
                users.put(command[1], command[2]);
            }
        }

        String[] result = new String[messages.size()];
        for (int i = 0; i < result.length; i++) {
            int idx = messages.get(i).indexOf("님");
            String userId = messages.get(i).substring(0, idx);
            String message = messages.get(i).substring(idx);

            result[i] = users.get(userId) + message;
        }

        return result;
    }
}
