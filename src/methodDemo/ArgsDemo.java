package methodDemo;
//有其它同载方法时，可变参数的方法是最后调用的
//文档注释先打一个/然后打；两个**，在按回车键
/**
 *
 */
public class ArgsDemo {
   /* public int plus(int a,int b){
        System.out.println("调用不可变参数");
        return a+b;
    }*/
    public int plus(int...a){
        int sum=0;
        System.out.println("调用不可变参数");
        for(int i:a){
         sum +=i;
        }
        return sum;
    }
    public static void main(String[] args){
        ArgsDemo ad=new ArgsDemo();
        System.out.println(ad.plus(5,6));
    }
}
