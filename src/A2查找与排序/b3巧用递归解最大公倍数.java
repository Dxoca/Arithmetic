package A2查找与排序;

import java.util.Arrays;


public class b3巧用递归解最大公倍数 {
    public static void main(String[] args) {
    //f(m,n)=f(n,m%n)
        System.out.println(gcd(12,60));
    }

    /**
     * O（2lgn）
     */
    static int gcd(int m,int n){
        if(n==0)
            return m;
        return gcd(n,m%n);
    }
}
