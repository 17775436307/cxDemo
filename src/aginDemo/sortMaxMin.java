package aginDemo;
import java.util.Scanner;
public class sortMaxMin {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("给数组用冒泡排序法从大到小排序");
        //定义一个数组
        int[] s=new int[6];
        System.out.println("用键盘输入数组数据");
        for(int i=0;i<s.length;i++){
            System.out.println("输入第"+(i+1)+"个数据:");
            s[i]=sc.nextInt();
        }
        for(int j=0;j<s.length;j++){
            for(int k=0;k<s.length-j-1;k++){
                int temp=0;
                if(s[k]<s[k+1]){
                    temp=s[k+1];
                    s[k+1]=s[k];
                    s[k]=temp;
                }
            }
        }
        System.out.println("输出整个数组的排序为:");
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
    }
}
