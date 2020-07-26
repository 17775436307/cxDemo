package aginDemo;
import java.util.Scanner;
public class MathRandom {
    public static void main(String [] args){
        System.out.println("要猜一个1-10的自然数");
        int guess=(int) (Math.random()*10+1);//Math.random生成的[0,1)的随机数.
        int input;
        do{
            System.out.println("输入一个自然数:");
            Scanner sc = new Scanner(System.in);
            input=sc.nextInt();
            if(input>guess){
                System.out.println("您猜得太大了")  ;
            }else if(input<guess){
                System.out.println("您猜得太小了");
            }

        }while(input!=guess);
        System.out.println("您猜对了："+"数字是"+input);
    }

}
