package A1;

import java.util.Scanner;

public class a3二进制中1的个数 {
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(Integer.toString(N, 2));//输出二进制数
        int count = 0;
        //算法一 【 与运算 1往左挪动 对比每一位】 1 2 4 8 16 32 每次都与 相同则记录
        for (int i = 0; i < 32; i++) {
            if ((N & (1 << i)) == (1 << i)) {
                //1 2 4 8 16 32 与 N 如果某位为1 则对应的 数字 之间相与（因为相同） 所以=(1<<i)
                count++;
            }
        }
        System.out.println(count);
        //算法二 与运算 1不动 N动
        count = 0;
        for (int i = 0; i < 32; i++) {
            if (((N >>> i) & 1) == 1)//1011&1[0001]=1;0101&0001=1;0010&0001=0
                count++;
        }
        System.out.println(count);
        //算法三 (x-1)&x 消除右边开始第一个1 都变为0
        /* 分析
            N:   10100
        -1
            N-1: 10011
        ->> N&(N-1)
                 10000 消去最低位1
        -1       01111
        &        000000
        两次与运算 两次 减法得到零 所以：算法如下
         */
        count=0;
        while(N!=0){
            N=N&(N-1);
            count++;
        }
        System.out.println(count);
    }
}

