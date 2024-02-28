package progammers.level1;

import java.util.Arrays;

// k번째 수
public class PG_42748 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }

    static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1; // 시작 인덱스
            int end = commands[i][1]; // 종료 인덱스
            int k = commands[i][2];

            // 1. 정해진 범위만큼 잘라서 배열을 만든다. (Arrays.copyOfRange() 사용 금지)
            int[] nums = new int[end - start];
            for (int j = 0; j < nums.length; j++) {
                nums[j] = array[start + j];
            }

            // 2. 배열을 오름차순 정렬한다.
            quickSort(nums, 0, nums.length - 1);
            answer[i] = nums[k - 1];
        }

        return answer;
    }

    // 왼쪽 피벗 퀵 정렬
    private static void quickSort(int[] nums, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        // 1차 정렬 (pivot을 기준으로 파티션을 나누기 위한 메서드)
        int pivot = partition(nums, lo, hi);

        quickSort(nums, lo, pivot - 1);
        quickSort(nums, pivot + 1, hi);
    }

    private static int partition(int[] nums, int left, int right) {

        int lo = left;
        int hi = right;
        int pivot = nums[left];

        // 왼쪽은 피벗보다 큰 값을 찾고, 오른쪽은 피벗보다 작은 값을 찾아서 swap!
        // 해당 과정을 거치면 피벗보다 작은값이 왼쪽에, 큰 값이 오른쪽에 위치하게 된다.
        while (lo < hi) {
            while (lo < hi && nums[hi] > pivot) {
                hi--;
            }

            while (lo < hi && nums[lo] <= pivot) {
                lo++;
            }

            // 두 요소의 위치를 스왑
            swap(nums, lo, hi);
        }

        // pivot과 lo의 위치를 스왑
        swap(nums, left,  lo);

        return lo;
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
