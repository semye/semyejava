package com.semye.base.arithmetic.search;

import java.util.Arrays;

/**
 * Created by yesheng on 2/25/21.
 */
class BinSearch {
    public static void main(String[] args) {
        int[] array = {5, 999, 99, 48, 23, 111, 32, 54, 77, 323};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        int index = binsearch(array, 323);
        System.out.println(index);
    }

//    public static int abc(int[] args, int target) {
//        int left = 0;
//        int right = args.length - 1;
//
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            if (args[mid] == target) {
//                return mid;
//            } else if (args[mid] < target) {
//                left = mid + 1;
//            } else if (args[mid] > target) {
//                right = mid - 1;
//            }
//        }
//        return -1;
//    }

    static int binsearch(int array[], int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else if (array[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }

}
