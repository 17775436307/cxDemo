package aginDemo;
import java.util.Scanner;
public class maxArray {
    public static void main(String [] args){
        //定义一个数组
        int[] sh={56,98,12,18,65};
        //比较数组大小，假如第一个数最大
        int max=sh[0];
        for(int i=0;i<sh.length;i++){
            if(max<sh[i])
                max=sh[i];
        }
        System.out.println("数组的最大值为："+max);
        System.out.println("使用增强型for循环来输出数组内容（foreach）");
        for(int n:sh){
            System.out.print(n+" ");
        }
    }
}
