package programmers.level1.success;

// 문자열 내 p와 y의 개수
public class PG12916 {
    public static void main(String[] args) {
        boolean isCheck = solution("pPoooyY");
        System.out.println("isCheck = " + isCheck);
    }

    static boolean solution(String str) {
        int pCnt = 0;
        int yCnt = 0;

        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'p') pCnt++;
            if(str.charAt(i) == 'y') yCnt++;
        }

        return pCnt == yCnt;
    }
}
