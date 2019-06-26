package Blue;
/**
 * Dxoca.cn 2019年5月10日 00:59:50
 */

import java.util.HashSet;
import java.util.Set;

//1949 能组成多少个四位的素数
public class _1949素数 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 5,1,4};// int[] arr = {1, 9, 4, 9}; 114514
        f(arr, 0);
        System.out.println(set.size());
        System.out.println(set.toString());
        System.out.println("全排列个数："+count);
    }

    static void f(int[] arr, int k) {
        for (int i = k; i < 6; i++) {//0-3 n的全排列是n中
            if(k==4)//排一次成功
                check(arr);   //全排列64 合理为 64/4 =24再检查
            //交换
            int t = arr[k];
            arr[k] = arr[i];
            arr[i] = t;
            f(arr, k + 1);
            t = arr[k];
            arr[k] = arr[i];
            arr[i] = t;//递归恢复
        }
    }
    static int count=0;
    static Set<Integer> set = new HashSet<Integer>();

    static public void check(int[] arr) {
        int x = arr[0]*100000+arr[1]*10000+arr[2] * 1000 + arr[3] * 100 + arr[4] * 10 + arr[5];//所有的素数判断 但是有重复
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(x); i++) {//素数
            if (x % i == 0) {
                flag = false;
//                System.out.println(x + "no");
//                count++;
                break;
            }
        }
        if (true) {
//            System.out.println(x + "yes");
//            count++;

            set.add(x);//去重复
        }
    }



}

