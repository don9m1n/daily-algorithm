package progammers.level2;

import java.util.Arrays;

// 파일명 정렬
public class PG_17686 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"})));
        System.out.println(Arrays.toString(solution(new String[]{"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"})));
        System.out.println(Arrays.toString(solution(new String[]{"foo", "abc"})));
    }

    static String[] solution(String[] files) {
        Arrays.sort(files, (o1, o2) -> {

            String[] file1 = divideFileName(o1);
            String[] file2 = divideFileName(o2);

            // HEAD가 동일한 경우 NUMBER 기준으로 정렬
            if (file1[0].equals(file2[0])) {
                return Integer.parseInt(file1[1]) - Integer.parseInt(file2[1]);
            }

            // 아니라면 HEAD 사전순 정렬
            return file1[0].compareTo(file2[0]);
        });

        return files;
    }

    static String[] divideFileName(String file) {

        String[] result = new String[3];
        result[0] = ""; // HEAD
        result[1] = ""; // NUMBER
        result[2] = ""; // TAIL

        int index = 0;
        for (int i = 0; i < file.length(); i++) {
            char ch = file.charAt(i);

            // Character.isDigit(ch): ch가 숫자면 true, else false
            if (index == 0 && !Character.isDigit(ch)) {
                result[index] += ch;
                continue;
            }

            if (index == 0 && Character.isDigit(ch)) {
                index++;
            }

            if (index == 1 && Character.isDigit(ch)) {
                result[index] += ch;
                continue;
            }

            if (index == 1 && !Character.isDigit(ch)) {
                index++;
            }

            result[index] += ch;
        }

        result[0] = result[0].toLowerCase();

        return result;
    }
}
