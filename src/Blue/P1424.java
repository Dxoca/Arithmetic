package Blue;

import java.util.Scanner;

public class P1424 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int x=cin.nextInt();//开始
        int n=cin.nextInt();//经过天
        int kilo=0;
        //250
        while(n--!=0){
            if(x==6||x==7)
            {
                x++;
                if(x==8)
                    x=1;
                continue;
            }
            kilo+=250;
            x++;
        }
        System.out.println(kilo);


    }
}
