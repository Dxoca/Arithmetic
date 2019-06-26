package A2查找与排序;

import java.util.Arrays;

public class b7思维很重要_希尔排序 {
    public static void main(String[] args) {
        int[] arr = {9, 3, 6, 7, 5, 4, 2, 1,9, 3, 6, 7, 5, 4, 2, 1,9, 3, 6, 7, 5, 4, 2, 1,9, 3, 6, 7, 5, 4, 2, 1};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void shellSort(int[] arr) {
        //不断的缩小增加量
        for (int interval = arr.length / 2; interval > 0; interval/=2) {
            for (int i = interval; i < arr.length; i++) {
                int target = arr[i];//后面的数字
                int j = i - interval;//前面的数字
                while (j > -1 && target < arr[j])//后面数字小于前面的数字 交换 小在钱 大在后
                {
                    arr[j + interval] = arr[j];
                    j -= interval;
                }
                arr[j + interval] = target;//while成功 则直接交换 反之不换
                //*******

            }
        }
    }
}
