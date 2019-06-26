package A1;

import java.util.Arrays;

public class a7出现K次与出现1次 {
    public static void main(String[] args){
        int[] arr={1,1,2,2,9,3,4,4,5,5,6,7};//3
        int k=arr[0];
        for (int i = 1; i < arr.length; i++) {
             k ^=arr[i];//异或 同为0 异为1 消去相同
            if(k!=0){
                System.out.println(arr[i]);
                arr[i]=0;
            }
        }
//        Arrays.sort();

//        System.out.println(k);
    }
}
