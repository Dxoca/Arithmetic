package Blue;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static Blue._1949素数.check;

public class P1036 {
    static int k = 0;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] xs = new int[cin.nextInt()];//n个数字
        k = cin.nextInt();//k个相加
        fun(xs, 0);
    }

    //素数共有多少种
    private static void fun(int[] xs, int index) {
        //全排列
        for (int i = index; i < k; i++) {
            if (k >= xs.length - 1) {//排成功
                checkxs(xs);
            }
            int t = xs[k];
            xs[k] = xs[i];
            xs[i] = t;
            fun(xs, k + 1);

            t = xs[k];
            xs[k] = xs[i];
            xs[i] = t;
        }

    }
    static Set<Integer> set=new HashSet<Integer>();
    public static boolean checkxs(int[] xs) {

        int tamp = 0;
        for (int i : xs) {
            tamp += i;
        }
        boolean falg = true;
        for (int i = 2; i < Math.sqrt(tamp); i++) {
            if (tamp % i == 0) {
                falg = false;
                break;
            }
        }
        if (falg) {
            if(set.add(tamp))
                System.out.println(tamp);
        }
        return true;
    }

}
