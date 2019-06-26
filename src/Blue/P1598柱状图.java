package Blue;

import java.util.Arrays;
import java.util.Scanner;

public class P1598柱状图 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        StringBuilder x=new StringBuilder();
        for (int i = 0; i < 4; i++) {
            x.append(cin.nextLine());
        }
//        System.out.println(x.toString());//ADD test
        int[] word=new int [26];//0-25
        int max=-1;
        for (int i = 0; i < x.length() ; i++) {
            if (x.charAt(i) <= 'Z' && x.charAt(i) >= 'A'){
                word[x.charAt(i)-'A']++;
                if(word[x.charAt(i)-'A']>max){//找出最大个数的单词 也就是最大行数
                    max=word[x.charAt(i)-'A'];
                }
            }
        }
        for (int i = max; i >0; i--) {//行 减少
            for (int j = 0; j<26;j++) { //26-j-max
                if(word[j]>=i){//单词个数 在从底部上来的行里的话 就输出星号
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
                if(j!=25){//最后一列末尾不加空格
                    System.out.print(" ");//除了最后一列 输出空格
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 26; i++) {
            System.out.print((char)('A'+i));
            if (i!=25)
                System.out.print(" ");
        }
    }
}
