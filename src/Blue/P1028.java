package Blue;

import java.util.Scanner;

public class P1028 {

    static long count = 1;
    public static void main(String[] args) {
/*
6 16 26 36 126 136
0 1
1 1
2 12
3 13
4 14 24 124
5 15 25 125
6 16 26 36 126 136 236

 */

        Scanner cin = new Scanner(System.in);
        System.out.print("int[] nums={");
        for (int i = 0; i <=1000; i++) {
            count = 1;
            fun(i);//1431034990
            System.out.print(count+",");
        }
        System.out.println("}");
//        fun(cin.nextInt());

    }

    private static void fun(int n) {
        for (int i = 1; i <= n / 2; i++) {
            count++;
            fun(i);
        }
    }

}
