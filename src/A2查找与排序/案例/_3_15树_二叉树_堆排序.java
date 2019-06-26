package A2查找与排序.案例;

public class _3_15树_二叉树_堆排序 {
    /**
     * 树的 先序 遍历
     *
     * @param arr
     * @param i
     */
    static void preOrder(int[] arr, int i) {
        if (i >= arr.length) {//出口
            return;
        }
        System.out.print(arr[i] + " ");//先 输出根节点
        preOrder(arr, i * 2 + 1);//输出左子树
        preOrder(arr, i * 2 + 2);//输出右子树
    }

    /**
     * 树的 中序 遍历
     *
     * @param arr
     * @param i
     */
    static void inOrder(int[] arr, int i) {
        if (i >= arr.length) {//出口
            return;
        }
        inOrder(arr, i * 2 + 1);//输出左子树
        System.out.print(arr[i] + " ");//输出根节点
        inOrder(arr, i * 2 + 2);//输出右子树
    }

    public static void main(String[] args) {
        int arr[] = {78, 56, 34, 43, 4, 1, 15, 2, 23};
        preOrder(arr, 0);
        System.out.println("\n===========");
        inOrder(arr, 0);
    }
}
