package Blue;

import java.util.Scanner;

public class P1035 {
    public static void main(String[] args) {
        int K=new Scanner(System.in).nextInt();
        double sum=0,n;
        for(n=1.0;K>sum;n++){//第一次 n=1 是1 第二次 n 2 是 1.5 ....
            sum+=1.0/n;
//            System.out.println((int)n+" "+sum);
        }
        System.out.println((int)--n);//for循环结束 n会自增1 所以我们减1

    }
}
