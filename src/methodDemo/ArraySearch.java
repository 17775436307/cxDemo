package methodDemo;
import java.util.Scanner;
public class ArraySearch {
    public boolean search(int a,int[] arr){
        //查找数据
          boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                flag=true;
                break;}
        }
        return  flag;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入要查找的数据:");
        int n=sc.nextInt();//输入要查找的数据
        //定义一个数组；
        int[] array={23,56,59,123,456,789};
        ArraySearch myArraySearch=new ArraySearch();
        //查找数据并输出找到与否；
         boolean flag=myArraySearch.search(n,array);
          if(flag){
              System.out.println("找到了");
          }else
              { System.out.println("没找到");}

    }
}
