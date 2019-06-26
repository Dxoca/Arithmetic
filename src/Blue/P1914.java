package Blue;

import java.util.Scanner;

public class P1914 {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        int n=cin.nextInt();
        StringBuilder words=new StringBuilder(cin.next());
        //A 65 Z 90 a97 z 112
        for (int i = 0; i <words.length(); i++) {

            words.setCharAt(i,(char)('a'+(words.charAt(i)-'a'+n)%26));
        }
        System.out.println(words.toString());
    }
}
