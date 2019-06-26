package Blue;

import java.util.Scanner;

public class P2141 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n= cin.nextInt();
        int[] nums =new int[n];
        for(int i=0;i<n;i++){
            nums[i]=cin.nextInt();
        }
        int count=0;
        int tamp=-1;
        for(int k=0;k<n;k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j && i != k) {
                        if( tamp!=nums[i]+nums[j]&nums[k]==nums[i]+nums[j]){
                            tamp=nums[i]+nums[j];//tamp 只出现一次 防止k重复
                            count++;
//                            System.out.println(nums[k]+" "+nums[i]+" "+nums[j]);
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
