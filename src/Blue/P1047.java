package Blue;

import java.util.Scanner;

public class P1047 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int L = cin.nextInt();//树 5 :0 1 2 3 4 5 六棵树
        int[] tree = new int[L+1];
        int M =cin.nextInt();//区域

        for (int i = 0; i < M; i++) {
            int beegin=cin.nextInt();
            int end =cin.nextInt();
            for(;beegin<=end;beegin++){
                tree[beegin]=1;//有1就是要开发
            }

        }
        int count=0;
        for(int i :tree){
            if(i==0)
                count++;
        }
        System.out.println(count);
    }

}
