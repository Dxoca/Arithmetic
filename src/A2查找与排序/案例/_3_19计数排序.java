package A2查找与排序.案例;

import java.util.Arrays;

public class _3_19计数排序 {
    public static void main(String[] args) {
        int[] arr={10,3,15,7,20};
        int max=ArraysMax(arr);
        CountSort(arr,max);
    }

    private static int ArraysMax(int[] arr) {
        int max=0x7fffffff+1;
        for (int i = 0; i < arr.length; i++) {
                if(arr[i]>max)
                    max=arr[i];
        }
        return max;
    }
    private static void CountSort(int[] arr,int max) {
        int[] help=new int[max+1];
        for (int i = 0; i < arr.length;i++) {
            help[arr[i]]++;
        }
        int current=0;
        for (int i = 0; i <help.length;i++) {
            while(help[i]>0){
                arr[current++]=i;
                help[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
