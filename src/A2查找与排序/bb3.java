package A2查找与排序;

public class bb3 {
    //旋转数组的最小数字（改造二分法）
    //把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
    // 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
    // 例如数组{34512} {34512}为{12345} 的一个旋转，该数组的最小值为1
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(fen(arr));
        //45 1 23

    }//2.17

    static int fen(int[] arr) {
        int begin = 0;
        int end = arr.length - 1;
        if (arr[begin] < arr[end])//最后的数字比最开始的数字大
            return arr[begin];
        while (begin + 1 < end) {//二个的时候 退出
            int mid = begin + ((end - begin) >> 1);
            //判断左侧有序还是右侧
            if (arr[begin] >= arr[end]) //54123右侧有序
                end = mid;
            else
                begin = mid;
        }
        return arr[end + 1];
        //特例 01111 》11101 10111

    }

}
