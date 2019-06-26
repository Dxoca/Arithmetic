package Blue;

import java.util.Scanner;

public class P1046 {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        int[] appleHigh=new int[10];
        for (int i=0;i<appleHigh.length;i++)
            appleHigh[i]=cin.nextInt();

        int handLength=cin.nextInt()+30;

        int count=0;
        for (int i = 0; i < appleHigh.length; i++) {
            if(appleHigh[i]<=handLength){
                count++;
            }
        }
        System.out.println(count);

    }
}
