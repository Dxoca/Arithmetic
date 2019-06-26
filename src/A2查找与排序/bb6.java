package A2查找与排序;

public class bb6 {//a的n次幂
//a的n次幂的算法优化
    public static void main(String[] args) {
        int y = powTow(2, 35);
        System.out.println(y);
        int x = pow(2, 30);
        System.out.println(x);


    }

    //O(n)
    static int pow(int a, int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= a;
        }
        return res;
    }

    static int powTow(int a, int n) {
        if (n == 0) return 1;//边界 n==ex
        int res = a;
        int ex = 1;
        //能翻
        while ((ex << 1) <= n) {
            res= res * res;
            ex <<= 1;//指数
        }
        return res * powTow(a, n - ex);//不能翻 差n-ex方没有乘到结果里去
    }
}
