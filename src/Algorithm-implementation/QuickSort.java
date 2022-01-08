package baekjoon.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 9, 2, 4, 7};
        l_pivot_sort(arr, 0, arr.length - 1); // 왼쪽 피벗 방식
        m_pivot_sort(arr, 0, arr.length - 1); // 중간 피벗 방식
    }

    private static void m_pivot_sort(int[] arr, int lo, int hi) {

        if (lo >= hi) {
            return;
        }

        int pivot = partition(arr, lo, hi);

        m_pivot_sort(arr, lo, pivot);
        m_pivot_sort(arr, pivot + 1, hi);
    }

    private static int partition(int[] arr, int left, int right) {
        int lo = left - 1;
        int hi = right + 1;
        int pivot = arr[(left + right) / 2]; // 중간 요소를 pivot으로 설정

        while (true) {
            do {
                lo++;
            } while (arr[lo] < pivot);

            do {
                hi--;
            } while (arr[hi] > pivot && lo <= hi);

            // hi가 lo보다 작다면 swap하지 않고 hi를 리턴!
            if (lo >= hi) {
                return hi;
            }

            // lo < hi가 유효하다면 두 요소를 스왑!
            swap(arr, lo, hi);
        }
    }

    private static void l_pivot_sort(int[] arr, int lo, int hi) {

        /**
         * lo >= hi 인 경우 원소가 1개 이하이기 때문에 정렬할 필요가 없음
         */
        if (lo >= hi) {
            return;
        }

        int pivot = partition(arr, lo, hi);

        l_pivot_sort(arr, lo, pivot - 1);
        l_pivot_sort(arr, pivot + 1, hi);
    }

    /* 왼쪽 피벗 방식
    private static int partition(int[] arr, int left, int right) {
        int lo = left;
        int hi = right;
        int pivot = arr[left];

        while (lo < hi) {
            while (arr[hi] > pivot && lo < hi) {
                hi--;
            }
            while (arr[lo] <= pivot && lo < hi) {
                lo++;
            }
            swap(arr, lo, hi);
        }

        swap(arr, left, lo);

        return lo;
    }
    */


    private static void swap(int[] arr, int lo, int hi) {
        int temp = arr[lo];
        arr[lo] = arr[hi];
        arr[hi] = temp;
    }
}
