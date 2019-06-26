package A2查找与排序.案例;
/**
 * Dxoca.cn
 */

import java.util.Scanner;

import static A2_1排序.QucikSort.swap;

public class _3_9最快效率求出乱序数组中的第k小的数 {
    public static void main(String[] args) {
        int[] arr = {3, 9, 7, 6, 1, 2};
        Scanner cin = new Scanner(System.in);
        int k = cin.nextInt();//第k小的数字 1的话 索引就0
        int numsK = SelectK(arr, 0, arr.length - 1, k);
        System.out.println(numsK);
    }

    /**
     * @param A      数组
     * @param beggin 左边
     * @param end    右边
     * @param aim    第k个数字 从1开始 现在这个序列中的第几个
     * @return 注意 主元的索引就是 （第k个 -1 ）索引
     */
    public static int SelectK(int[] A, int beggin, int end, int aim) {
        int q = partition(A, beggin, end);//主元 的下标
        int qK = q - beggin + 1;//主元的下标 q-开始的 0开始 +1
        if (qK == aim) return A[q];
        else if (qK > aim) return SelectK(A, beggin, q - 1, aim);//要的目标个数 小于主元的索引
        else return SelectK(A, q + 1, end, aim - qK); //aim-qK是重点 这边是右侧 目标在主元右边 所以是目标减去主元 //3.9
    }

    //快排思想  pivot 主元的索引 就是排序后的 第几个数+1 这里用的快排的 单向横扫
    private static int partition(int[] a, int beggin, int end) {
        //三点定中法
        int midIndex = beggin + (end - beggin) / 2;//中间下标
        int midValueIndex = -1;//中值的下标记
        if (a[beggin] <= a[midIndex] && a[beggin] >= a[end]) { //end beggin mid
            midValueIndex = beggin;//beggin 的数组是中间数
        } else if (a[end] <= a[midIndex] && a[end] >= a[beggin]) {//beggin end mid
            midValueIndex = end;
        } else {
            midValueIndex = midIndex;
        }
        swap(a, beggin, midValueIndex);//确定三点中值法的 中间值为 主元 pivot  提高效率 而不是默认的最左边数
        int pivot = a[beggin];//作为中心
        int left = beggin + 1;
        int right = end + 0;
        while (left <= right) {//索引没有越界
            if (a[left] <= pivot)//左边是小的 没问题
                left++;//换下一个数
            else {//左边大了 swap 右边 指针往中间走
                swap(a, left, right);
                right--;
            }
        }
        swap(a, beggin, right);//结束 主元 换到中间
        return right;//
    }
}

