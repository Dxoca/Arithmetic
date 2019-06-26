package CometOj;

import java.util.Scanner;

public class C_6B {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);

        int q=cin.nextInt();
        for (int i=0;i<q;i++){
            int ans=0;
            long  n=cin.nextLong();
            for(long j=1L;j<=Math.sqrt(n);j++){
                if(n<=10)
                    break;
                int tamp=0;
                if(n%j==0){//是约数
                    String ns=n+"";
                    char[] nss;
                    nss=ns.toCharArray();
                    for (char z:nss) {
                        tamp+=z-'0';
                    }
//                    System.out.println(tamp);
                }
                //1145141919810
                //9223372036854775807
                if(tamp==Math.abs(n/2)){
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
