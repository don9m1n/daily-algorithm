package progammers.level1;

// 옹알이2
public class PG133499 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"ayayeaya", "yee", "u", "maa"}));
    }

    static int solution(String[] babbling) {
        String[] filters = {"aya", "ye", "woo", "ma"};

        int count = 0;
        for (int i = 0; i < babbling.length; i++) {
            StringBuilder word = new StringBuilder();
            String previous = "";
            for (int j = 0; j < babbling[i].length(); j++) {
                word.append(babbling[i].charAt(j));
                for (String filter : filters) {
                    if (word.toString().equals(previous)) {
                        break;
                    } else if (word.toString().equals(filter)) {
                        word = new StringBuilder();
                        previous = filter;
                    }
                }
            }

            if(word.length() == 0) {
                count++;
            }
        }

        return count;
    }
}
