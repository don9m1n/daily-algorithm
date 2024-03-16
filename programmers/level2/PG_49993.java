package progammers.level2;

import java.util.ArrayList;
import java.util.List;

// 스킬트리
public class PG_49993 {
    public static void main(String[] args) {
        System.out.println(solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
        System.out.println(solution("C", new String[]{"C", "F", "E", "Q"}));
    }

    static int solution(String skill, String[] skill_trees) {

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < skill.length(); i++) {
            list.add(skill.charAt(i));
        }

        int count = 0;
        // C, B, D를 제외한 문자를 제거
        for (String skillTree : skill_trees) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < skillTree.length(); i++) {
                if (list.contains(skillTree.charAt(i))) {
                    sb.append(skillTree.charAt(i));
                }
            }

            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < sb.length(); i++) {
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j) == sb.charAt(i)) {
                        sb2.append(j);
                    }
                }
            }

            boolean flag = true;
            for (int i = 0; i < sb2.length(); i++) {
                if (sb2.charAt(i) != (char) (i + 48)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                count++;
            }

        }

        return count;
    }
}
