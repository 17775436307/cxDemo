package aginDemo;
import java.util.Scanner;
public class ShuChuYinWen {
    public static void main(String [] args){
        //输出26个英文字母,分两行输出
        char ch='a';
        int count=1;
        while(ch<'z'){
            System.out.println(ch);
            if(count%13==0) System.out.println();
             ch++;
            count++;
        }

    }
}
