package programmers.level1;

import java.util.*;

// 두 개 뽑아서 더하기
public class PG68644 {
    public static void main(String[] args) {
        int[] solution = solution(new int[]{5,0,2,7});
        System.out.println("solution = " + Arrays.toString(solution));
    }

    public static int[] solution(int[] numbers) {
        // Set<Integer> set = new HashSet<>();
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                set.add(sum);
            }
        }

        return set.stream().mapToInt(i -> i).toArray();

        /* code
            List<Integer> list = new ArrayList<>(set);
            Collections.sort(list);
            return list.stream().mapToInt(i -> i).toArray();
        */
    }
}
