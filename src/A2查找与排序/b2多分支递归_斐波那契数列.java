package A2查找与排序;

/**对于一个问题 可能：
 * 直接量+小规模
 * 多个小规模
 * O(2^n)
 */
public class b2多分支递归_斐波那契数列 {
    //1 1 2 3 5 8 13 21 34
    //f(n)=f(n-1)+f(n-2)
    public static void main(String[] args) {
        System.out.println(fib(45));
    }

    static int fib(int n) {
        if (n == 1 || n == 2)//遇到1 2 就返回1
            return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
/**先纵后横
 *                     6
 *             5              4
 *        4         3       3    2
 *     3   2      2  1    2  1
 *   2 1
 *   1 1   1     1   1   1  1    1
 * add=13
 */

