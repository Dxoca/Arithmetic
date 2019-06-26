package A2查找与排序;

import javax.rmi.CORBA.Util;
import java.util.Arrays;
import java.util.Random;

public class bb1 {//三种排序

    public static void main(String[] args) {
        int N = 1000;
        int[] arr = new int[N];//N-1个数字
        int[] arr1=new int[N];
        for (int i = 0; i < arr.length - 1; i++) {//length-1是留下一个 来写多的数字

            arr1[i]=arr[i] = (new Random().nextInt(5)+1)*(new Random().nextInt(N - 1)+1);
        }//构建随机数组
        System.out.println(Arrays.toString(arr));
        maopao(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

    }

    /**
     * Dxoca.cn
     * @param arr
     */

    static void maopao(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
