package aginDemo;
import java.util.Scanner;
public class AgainAgain {
    public static void main(String [] args){
        //请输入年份；
        System.out.println("请输入年份：");
         Scanner sc = new Scanner(System.in);
         int year=sc.nextInt();
         if( ((year%4==0)&&(year%100!=0))||(year%400==0)){
            System.out.println(year+"是闰年！");
         }else{
             System.out.println(year+"不是闰年！");
         }
    }
}