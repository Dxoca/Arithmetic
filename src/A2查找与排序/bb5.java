package A2查找与排序;

public class bb5 {//找出数组中最长的连续递增子序列(部分有序)

    public static void main(String[] args) {
        int[] arr = {1, 9, 2, 5, 7, 3, 4, 6, 8, 0};//3,4,6,8
        fun(arr);
    }

    public static void fun(int[] arr) {
        int begin, end, max = -1;
        int[] maxIndex = {0, 0};
        begin = end = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] <= arr[i]) {//1 9
                end++;
            } else {//一组完成
                if (max <= end - begin + 1) {//找出最大长度 并记录索引
                    max = end - begin + 1;
                    maxIndex[0] = begin;
                    maxIndex[1] = end;
                }
                begin = end + 1;//重置索引
                end++;
            }

        }
        for (; maxIndex[0] <= maxIndex[1]; maxIndex[0]++) {
            System.out.print(arr[maxIndex[0]] + "");
        }
        System.out.print("\n" + max);
    }

}
