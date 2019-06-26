package A2查找与排序;

/**
 * Dxoca.cn
 */
public class b5汉诺塔 {
    public static void main(String[] args) {
        p(3, "A", "B", "C");
    }

    /**
     * 将N个盘子从Source移动到target的路径打印
     * @param N    初始的N个从小到达的盘子 N是最大编号
     * @param form 原始柱子
     * @param to   辅助柱子
     * @param help 目标柱子
     */
    static void p(int N, String form, String to, String help) {
        if (N == 1) {
            System.out.println("move " + N + " form " + form + " to " + to);
            return;
        }
        p(N - 1, form, help, to);//先把前N-1个盘子挪到辅助空间上去
        System.out.println("move " + N + " form " + form + " to " + to);//N可以顺利到达target
        p(N - 1, help, to, form);//让N-1从辅助空间回到源空间上去 恢复

    }
}
