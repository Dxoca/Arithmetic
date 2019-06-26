package A2查找与排序.案例;

import java.util.Arrays;

//数组堆化
public class _3_16_堆排序 {
    //3_16-18
    //先 堆化 反向调整使得每个子节点 排序
    public static void main(String[] args) {
        int arr[] = {78, 56, 34, 43, 4, 1, 15, 2, 23};
        int arr2[]={1, 2, 15, 23, 4, 34, 78, 43, 56};
//        MinHeap(arr);//小顶堆 [1, 2, 15, 23, 4, 34, 78, 43, 56]
        MinHeapSort(arr);//先化成小顶部堆 然后在排序
        System.out.println(Arrays.toString(arr));
        System.out.println("++++++++++++");

//        MaxHeap(arr2);//[78, 56, 34, 43, 4, 1, 15, 2, 23]
        MaxHeapSort(arr2);//先化成大顶对 再排序
        System.out.println(Arrays.toString(arr2));
    }

    private static void MinHeap(int[] A){
        int n=A.length;
        for (int i = n / 2 - 1; i >=0; i--) {
            MinHeapFixDown(A,i,n);
        }
    }

    /**
     *
     * @param A 数组
     * @param i 父节点 第一个为最后一个父节点
     * @param n 现存堆的长度
     */
    private static void MinHeapFixDown(int[] A, int i,int n) {
         //找到左右孩子
         int left =2*i+1;//左
         int right=2*i+2;//右
        //如果左孩子以及越界 i是叶子节点
        if(left>=n){//
            return;
        }
        int min=left;
        if(right>=n){
            min=left;
        }else{
            if(A[right]<A[left]){// right数值小
                min=right;
            }
        }
        //min指向了左右孩子中较小的 那个

        //A[i]比俩还在都小 就不用调整
        if(A[i]<=A[min]){
            return;
        }
        //否则 找到俩孩子中较小的 交换
        swap(A,i,min);
        //孩子小的那个位置数值发生了变化 i变更为小孩子的位置递归调用
        MinHeapFixDown(A, min,n);
    }
    private static void MaxHeap(int [] A){
        int n=A.length;
        for (int i = n/2-1; i>=0; i--) {
            MaxHeapFixDown(A,i,n);
        }
    }
    private static void MaxHeapFixDown(int[] A, int i, int n) {
        int left=i*2+1;
        int right=i*2+2;
        if(left>=n){//左边越界了
            return;
        }
        int max=left;
        if(right>=n){
            max =left;
        }else{
            if(A[right]>A[left])
                max=right;
        }
        if (A[i] > A[max]) {//比max大
            return;
        }
        swap(A,i,max);
        MaxHeapFixDown(A, max,n);
    }
    private static void MinHeapSort(int[] A){
        int n=A.length;
        //先对A进行队化
        MinHeap(A);//建立小顶对
//        System.out.println(Arrays.toString(A));
        //把堆顶 0号元素和最后一个元素对消
        for (int x = n-1; x >=0; x--) {//x堆顶的位置
            swap(A,0,x);//堆顶元素换到元素末尾 末尾到堆顶 把最小的换到最后 然后把它关起来
            MinHeapFixDown(A,0,x);//缩小堆的范围 对堆顶元素进行向下调换
        }
    }
    private static void MaxHeapSort(int[] A){
        int n=A.length;
        MaxHeap(A);
        for (int i = n-1; i >=0; i--) {
            swap(A,0,i);
            MaxHeapFixDown(A,0,i);
        }
    }
    private static void swap(int[] A,int x, int y){
        int tamp = A[x];
        A[x]=A[y];
        A[y]=tamp;
    }
}
