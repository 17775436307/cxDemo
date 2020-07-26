package aginDemo;
import java.util.Scanner;
public class ComeOn {
    public static void main(String [] args){
        //请输入星期的英文单词
        System.out.println("请输入星期的英文单词：");
        Scanner sc=new Scanner(System.in);
        String  week= sc.next();
        week=week.toUpperCase();
        switch(week){
            case "MONDAY": System.out.println("星期一");break;
            case "TUESDAY": System.out.println("星期二");break;
            case "WENESDAY": System.out.println("星期三");break;
            case "THUESDAY": System.out.println("星期四");break;
            case "FRIDAY": System.out.println("星期五");break;
            case "STURDAY": System.out.println("星期六");break;
            case "SUNDAY": System.out.println("星期日");break;
            default:System.out.println("不在范围内！");break;
        }
    }
}
