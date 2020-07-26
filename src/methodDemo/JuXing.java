package methodDemo;
import java.util.Scanner;
public class JuXing {
    public int area(){
        int length=10, width=5;;
        int getArea=length*width;
        return getArea;
}
    public static void main(String [] args){
        JuXing myJuXing=new JuXing();
        myJuXing.area();
        System.out.println(myJuXing.area());
    }
}








