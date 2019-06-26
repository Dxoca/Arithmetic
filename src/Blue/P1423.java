package Blue;

import java.util.Scanner;

public class P1423 {
    public static void main(String[] args) {
        double x=new Scanner(System.in).nextDouble();
        double step=2,add=2;
        int count=1;
        while (x>add){
            step*=0.98;
            add+=step;
            count++;
        }
        System.out.println(count);
    }
}
