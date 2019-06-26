package Blue;

import java.util.Scanner;

public class P1055 {
    public static void main(String[] args) {
        Scanner cin= new Scanner(System.in);
        String ISBN=cin.next();
        int Hash=0;int k=0;int mark=0;
        boolean flag=false;
        for (int i = 0; i < ISBN.length(); i++) {
            if(ISBN.charAt(i)=='-')
                continue;
            k++;//1-9
            if(k!=10)
                Hash+=(ISBN.charAt(i)-'0')*k;
            if(i==ISBN.length()-1){
                mark=Hash%11;
                if(ISBN.charAt(i)=='X')//输入末尾为X 代表10
                    if(mark==10)
                        flag=true;
                if(mark==ISBN.charAt(i)-'0') {//平常数字判断
                    flag = true;
                }
            }
        }
        if(flag)
            System.out.println("Right");
        else{
            for (int i = 0; i < ISBN.length()-1; i++) {
                System.out.print(ISBN.charAt(i));
            }
            if(mark==10)
                System.out.print('X');
            else
                System.out.print(mark);
        }
    }
}
