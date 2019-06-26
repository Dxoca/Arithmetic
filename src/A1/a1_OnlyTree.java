package A1;

import java.util.Random;

public class a1_OnlyTree {
    //找出唯一的成对的数字： 1-1000 的数字放到  有 1001的元素数组中 其中只有唯一的一个元素重复。找出这个元素
    // 1- 10 多处一个
    public static void main(String[] args) {
        int N = 51;
        int[] arr = new int[N];//N-1个数字
        for (int i = 0; i < arr.length - 1; i++) {//length-1是留下一个 来写多的数字
            arr[i] = i + 1;
        }
        //最后一个随机数
        arr[arr.length - 1] = new Random().nextInt(N - 1) + 1;//0到最后一个数字（不包括这个） 然后从零再往后移动1位 ？？
        //随机下标
        int index = new Random().nextInt(N);//0到 N-1
        int temp;
        temp = arr[index];
        arr[index] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        for (int x : arr)
            System.out.print(x + "|");
        //初始化完毕 正式开始
        //异或遍历一次算法 第一次for 可以和初始化写一起
        int x1 = 0;
        for (int i = 1; i <= N - 1; i++) {//所有的数字
            x1 ^= i;
        }//x消去这个重复的数字 然后 再和 原来所有的数字 异或  就身下原先重复的数字的
        for (int i = 0; i < N; i++) {//所有数组 与 异或结果异或
            x1 ^= arr[i];
        }
        System.out.printf("\n%d\n", x1);
        System.out.println("++++++++++++++++++");
        //辅助空间算法
        int[] helper = new int[N];
        for (int i = 0; i < N; i++) {
//            helper[arr[i]]++;
            if (++helper[arr[i]] == 2) {
                System.out.println(arr[i]);
                break;
            }
        }
        //开辅助空间
    }
//因为 值传递 所以不用,, 有问题
//    public static void swap(Integer a, Integer b) {
//        Integer temp = a;
//        a = b;
//        b = temp;
//        System.out.println("OK");
//    }
}
