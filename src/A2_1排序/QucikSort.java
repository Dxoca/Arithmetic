package A2_1排序;

import java.util.Arrays;
import java.util.Random;

//单向扫描划分 快速排序
public class QucikSort {
    public static void main(String[] args) {
        int N = 9;
        int[] arr = new int[N];//N-1个数字
        for (int i = 0; i < arr.length - 1; i++) {//length-1是留下一个 来写多的数字
            arr[i] = (new Random().nextInt(5) + 1) * (new Random().nextInt(N - 1) + 1);
        }
        System.out.println(Arrays.toString(arr));
        qucikSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void qucikSort(int[] A, int left, int right) {
        if (left < right) {
            int mid = partion2(A, left, right);//分区
            qucikSort(A, left, mid - 1);//左部分
            qucikSort(A, mid + 1, right);//右部分
        }
    }

    //单向扫描划分
    public static int partion(int[] A, int left, int right) {
        int pivot = A[left];//最最左边的数 作为轴 Pivot 中心点
        int sp = left + 1;//扫描指针//位A[p+1]
        int bigger = right;//左侧指针
        while (sp <= bigger) {//索引 没有相互跨界
            if (A[sp] <= pivot)//小于 轴（轴的左边 小）
                sp++;//左指针 右移
            else { //比轴大 应该在右边  因为是从左边开始扫描 大于轴的元素 和最右边的 数交换 书--
//                swap(A[sp], A[bigger]);//大于主元 元素交换 指针左移
                swap(A, sp, bigger);//将中心点交换到中间。
                bigger--;
            }
        }
//左右排完 复位轴
        swap(A, left, bigger);///换轴 作为下次的 mid 因为lift 一直是没有变的 他交给了 sp
        return bigger;//->mid 让partion的右边界 作为轴 而 这个 数值 就是初始化的Pivot
    }
    //双向扫描划分
    public static int partion2(int[] A, int p, int r) {//3.4
        int povit = A[p];
        int left = p + 1;
        int right = r;
        while (left <= right) {
            //left不听的往右边走
            while (left <= right && A[left] <= povit) left++;//循环退出时 left一定只想第一个大 于主元的元素
            while (left <= right && A[right] > povit) right--;//循环退出时 right一定只想第一个小 于主元的元素
            if (left < right)
                swap(A, left, right);
        }
        swap(A, p, right);
        return right;//返回right
    }
//三分法
    public static void swap(int[] arr, int x, int y) {
        int tamp = arr[x];///换轴 作为下次的 mid
        arr[x] = arr[y];
        arr[y] = tamp;
    }
}



//理解文献 参考推荐
// 单轴 扫描 https://blog.csdn.net/Holmofy/article/details/71168530