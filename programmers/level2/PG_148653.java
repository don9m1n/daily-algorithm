package progammers.level2;

// 마법의 엘리베이터
public class PG_148653 {
    public static void main(String[] args) {
        System.out.println(solution(16));
        System.out.println(solution(45));
        System.out.println(solution(95));
        System.out.println(solution(2554));
        System.out.println(solution(2654));
    }

    static int solution(int storey) {

        int count = 0;

        while (storey > 0) {
            int digit = storey % 10;
            storey /= 10;

            if (digit == 5) {
                if (storey % 10 >= 5) {
                    count += (10 - digit);
                    storey++;
                }else {
                    count += digit;
                }
            } else if (digit > 5) {
                count += (10 - digit);
                storey++;
            } else {
                count += digit;
            }
        }

        return count;
    }
}
