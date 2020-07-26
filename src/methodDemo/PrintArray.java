package methodDemo;
import java.util.Scanner;
public class PrintArray {
    public  void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int[] array=new int[15];
        for(int i=0;i<array.length-5;i++){
            System.out.println("输入第"+(i+1)+"个数据：");
            array[i]=sc.nextInt();

        }
        PrintArray pa=  new PrintArray();
        pa.print(array);
    }
}
