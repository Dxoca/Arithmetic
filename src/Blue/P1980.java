package Blue;

import java.util.Scanner;
//Dxoca.cn
public class P1980 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n =cin.nextInt();//上界限
        //String x =cin.next(); //目标 如果用String输入的话 那么 后面判断符合 用 x.charAt(0) 或者 x.compareTo 比较
        int y =cin.nextInt(); //目标
        StringBuilder nums = new StringBuilder("");
        for (int i = 1; i <=n; i++) {
            nums.append(i);
        }
        int count=0;
        for (int i = 0; i < nums.length(); i++) {
            if(nums.charAt(i)==(y+'0')){ //判断是否符合
                count++;
            }
        }
        System.out.println(count);
    }
}
