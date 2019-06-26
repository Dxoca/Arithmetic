package A2查找与排序;

import java.util.Arrays;

/**二分查找 Dxoca.cn
 * 等价于三个子问题
     * 左边找（递归）
     * 把N从A移动到B
     * 右边找（递归）
 * ps:左边查找与右边查找值选其一
 * @param
 */
public class b6二分查找递归解法 {
    public static void main(String[] args) {
        int[] arr={1,4,1,2,2,152,4,4,99,4,4,5,6,6,4,13,4,4,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch1(arr,0,arr.length-1,99));
    }
    private static int binarySearch1(int[] arr,int low,int high,int key){
        if(low>high)
            return -1;
        int mid =low+((high-low)>>1);
        int midVal =arr[mid];
        if(midVal<key)//右边
            return binarySearch1(arr,mid+1,high,key);
        else if(midVal>key)//左边
            return binarySearch1(arr,low,high-1,key);
        else
            return arr[mid];
    }

}
