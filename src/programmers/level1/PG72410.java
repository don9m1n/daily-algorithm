package programmers.level1.success;

// 신규 아이디 추천 [2021 KAKAO BLIND RECRUITMENT]
public class PG72410 {

    public static void main(String[] args) {
        String solution = solution("abcdefghijklmn.p");
        System.out.println("solution = " + solution);
    }

    public static String solution(String new_id) {

        // 1. 입력받은 id의 대문자를 소문자로 치환
        new_id = new_id.toLowerCase();

        // 2. new_id 에서 허용문자를 제외한 문자를 제거
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

        // 3. 연속된 .을 .으로 치환
        new_id = new_id.replaceAll("\\.+", ".");

        // 4. new_id 에서 마침표(.)가 처음이나 끝에 위치한다면 제거
        new_id = new_id.replaceAll("(^\\.)|(\\.$)", "");

        // 5. new_id가 빈 문자열이라면, new_id에 "a"를 대입
        if (new_id.length() == 0) {
            new_id += "a";
        }

        /*
          6. new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
          만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        */
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15).replaceAll("\\.$", "");
        }

        // 7. new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if (new_id.length() <= 2) {
            while (new_id.length() < 3) {
                new_id += new_id.charAt(new_id.length() - 1);
            }
        }

        return new_id;
    }
}
