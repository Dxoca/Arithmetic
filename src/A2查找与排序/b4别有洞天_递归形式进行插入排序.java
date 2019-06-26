package A2查找与排序;
//十大排序 算法https://www.runoob.com/w3cnote/ten-sorting-algorithm.html
public class b4别有洞天_递归形式进行插入排序 {
    public static void main(String[] args) {
    int[] arr={5,4,3,2,1};
    insertSort(arr,arr.length-1);
        for (int x: arr) {
            System.out.print(x+" ");
        }
    }
    static void insertSort(int[] arr, int k) {
        if (k == 0)//载入到头 就开始
            return;
        //对前k-1个元素排序
        insertSort(arr, k - 1);
        int x = arr[k];
        int index = k - 1;
        while (index > -1 && x < arr[index]) {//k-1=index arr[k]<arr[index]=【arr[k-1]】前面的比后面的小 2<6
            arr[index+1]=arr[index];//后面的=前面的 6=2 //最后一个和最前面的一个做交换 然后 一个一个的往前换
            index--;//前面的都插完
        }
        arr[index+1]=x;//index+1=k
    }
}
