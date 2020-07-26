package methodDemo;
import java.util.Scanner;
public class JieCheng {
    public int jie(int a){
        int jc=1;
        for(int i=1;i<=a;i++){
            jc=jc*i;
        }
        return jc;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int i=sc.nextInt();
        JieCheng myJieCheng=new JieCheng();
        myJieCheng.jie(i);
        System.out.println(i+"的阶乘为："+myJieCheng.jie(i));
        //求1！+2！+3！+4！+5！的阶乘和
        int sum=0;
        for(int j=1;j<=i;j++){
            int t=myJieCheng.jie(j);
            sum +=t;
        }
        System.out.println("1！+2！+3！+4！+5！+.......+"+i+"!"+"的阶乘和为："+sum);
    }
}
