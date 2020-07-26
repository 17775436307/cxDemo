package methodDemo;
import java.util.Scanner;
public class NoCanShuReturn{
    //无参数无返回值 创建一个无参数无返回值的类

    public void printStar(){
        System.out.println("void是无返回值的修饰类型");
        System.out.println("*************************************");
    }
    public void helloWord(){
        System.out.println("欢迎来到我的世界！");
    }
    public static void main(String [] args){
        NoCanShuReturn myNoCanShuReturn=new NoCanShuReturn();
        myNoCanShuReturn.printStar();
        myNoCanShuReturn.helloWord();
        myNoCanShuReturn.printStar();

    }
}
