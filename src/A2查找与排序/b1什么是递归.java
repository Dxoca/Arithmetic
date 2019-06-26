package A2查找与排序;
/**
 * @Dxoca
 * ---重复中找变化 变化中的重复---
 */

import javax.sound.midi.Soundbank;
//一个地方把它划一块出来 剩余的交给递归下一步
public class b1什么是递归 {
    public static void main(String[] args) {
        System.out.println(f(4));//阶乘
        f2(1, 10);//I 到 J 打印
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(f3(arr,0));//数组元素求和
        System.out.println(reverse("123456",5));//字符串翻转
    }

    /*
       f(n):求n的阶乘-->f(n-1)求n-1的阶乘
       找重复：n*(n-1)的阶乘，求n-1的阶乘是原问题的重复（规模更小）——子问题
       找变化：变化的量作为参数
       找边界:出口*/
    static int f(int n) {//1*2*3*4*5...
        if (n == 1)
            return 1;
        return n * f(n - 1);

    }

    /*
       打印I到J
       我做一部分 剩下的委托
       找重复：n*(n-1)的阶乘，求n-1的阶乘是原问题的重复（规模更小）——子问题
       找变化：变化的量作为参数
       找边界：出口*/
    static void f2(int i, int j) {
        if (i > j) {
            System.out.println();
            return;
        }
        System.out.print(i + " ");
        f2(i + 1, j);
    }

    /**数组求和
     * 对arr 所有元素求和
     * 找重复
     * 找变化：数组长度
     * 找边界：最后一个字符
     */
    static int f3(int[] arr, int begin) {
        if(begin==arr.length-1) {
            return arr[begin];
        }
        return arr[begin] + f3(arr, begin + 1);
    }
    /**翻转字符串
     *划一刀 abcde
     * e+翻转（abcd） e abcd
     * d+翻转（abc）e d abc
     *
     */
    static String reverse(String src,int end){
        if(end==0){//最头
            return ""+src.charAt(0);
        }
        return src.charAt(end)+reverse(src, end-1);
    }

}
