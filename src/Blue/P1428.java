package Blue;

import java.util.Scanner;

public class P1428 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n =cin.nextInt();
        int[] fishs=new int[n];
        int[] end=new int[n];
        for(int i=0;i<n;i++){
            fishs[i]=cin.nextInt();//录入数据
            for (int j=0;j<i;j++){
                if(fishs[j]<fishs[i])//左边的数字 比我小 就计数
                    end[i]++;
            }
        }
        for (int i:end) {
            System.out.print(i+" ");

        }
    }
}
