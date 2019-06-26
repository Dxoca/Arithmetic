package A2查找与排序.案例;

import java.util.Arrays;

/**
 * 输入一个数组，调整数组中数字的顺序，使得技术位于数组的前半部分 偶数位于数组的后半部分 要求时间复杂度为O（n）
 */
//归并思想空间小号O（n） 快排思想（双向横扫）
public class 调整数组顺序使奇数位于偶数的前面 {
    public static void main(String[] args) {
        int[] arr = {1, 9, 2, 5, 7, 3, 4, 6, 8, 0};
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            while (left <= right && arr[left] % 2 == 0) {
                left++;
            }//偶数
            while (left <= right && arr[right] % 2 != 0) {
                right--;
            }//奇数
            if (left < right) {
                int tamp = arr[right];
                arr[right] = arr[left];
                arr[left] = tamp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
