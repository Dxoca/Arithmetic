package Blue;

import java.util.Scanner;

public class P1427 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] nums =new int[100];
        int mark=0;
        for(int i=0;;i++){
            nums[i]=cin.nextInt();
            if(nums[i]==0)
                break;//直接把mark断在了0之前的数字 的索引
            mark=i;
        }
        for(int i=mark;i>=0;i--) {
            System.out.print(nums[i]);
            if(i!=0)
                System.out.print(" ");//控制空格
        }
    }
}
