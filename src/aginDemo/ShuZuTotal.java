package aginDemo;
import java.util.Scanner;
public class ShuZuTotal {
    public static void main(String [] args){
        //输出一个数组的累加和
        Scanner sc =new Scanner(System.in);
        //定义一个数组
        int[] intArray=new int[4];
        for(int i=0;i<intArray.length;i++){
            System.out.println("请输入数组的"+(i+1)+"个数据：");
            intArray[i]=sc.nextInt();
        }
        //求累加和
        int sum=0;
        for(int j=0;j<intArray.length;j++){
            sum += intArray[j];
        }
        System.out.println("数组intArray的和为："+sum);
    }
}
