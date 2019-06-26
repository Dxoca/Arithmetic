package CometOj;

import java.util.Scanner;

public class C_6A {
    //114514
    public static void main(String[] args) {
        int[] ans={1145141,154114, 145411, 141451, 415114, 411145, 411415, 151441, 411541,
                411154, 144151, 441115, 441511, 415141, 414115, 154411, 414511, 451114,
                511144, 445111, 511414, 541114, 415411, 111544, 441151, 411451, 414151,
                451141, 514114, 141514, 115144, 114514, 111445, 451411, 511441, 115414,
                145114, 454111, 141145, 541141, 111454, 141154, 141415, 141541, 544111,
                151144, 114154, 541411, 514411, 114415, 144115, 151414, 145141, 411514,
                144511};
        String[] anss=new String[ans.length];
        int k=0;
        for (int i:ans) {
//            System.out.println(i);
            anss[k++]=i+"";
        }

        Scanner cin =new Scanner(System.in);
        String sour=cin.next();
        System.out.println(sour);
        int count=0;
        for(int i=0;i<ans.length;i++){
            int index=0;
//            System.out.println("x");
            while((index= sour.indexOf(ans[i],index))!=-1/*前面空格*/){//存在的一个单词 并且单词的后面是空格
                index++;

                count++;
            }
        }
        System.out.println(count);
        System.out.println("哈哈哈哈哈");

        System.out.println("哈哈哈哈哈");
    }



}
