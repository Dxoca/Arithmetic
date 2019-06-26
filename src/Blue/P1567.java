package Blue;

import java.util.Scanner;

public class P1567 {

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        long nums[]=new long[3];
        int count=0;
        int max=-1;
        for(int i=0;i<n;i++){
            nums[2]=cin.nextLong();//后面
            if(nums[2]>nums[1]){
                count++;
                if(max<count)
                    max=count;
            }
            else
                count=1;
            nums[1]=nums[2];
        }
        System.out.println(max);
    }
}
