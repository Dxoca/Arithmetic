package Blue;

import java.util.Scanner;

public class P1200 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String a=cin.nextLine();
        String b=cin.nextLine();
        int as=1,bs=1;
        for (int i = 0; i < a.length(); i++) {
            as*=a.charAt(i)-'A'+1;//A 为1
        }
        for (int i = 0; i < b.length(); i++) {
            bs*=b.charAt(i)-'A'+1;//A 为1
        }
        if(as%47==bs%47){
            System.out.println("GO");
        }
        else
            System.out.println("SATY");
    }
}
