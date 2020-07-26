package methodDemo;

public class ExchangeDemo {
    public void ec(int a,int b){
        int temp=0;
         temp=a;
         a=b;
         b=temp;
        System.out.println("调用中的值："+"a="+a+",b="+b);
    }
    public static void main(String[] args){
        int a=12,b=56;
        System.out.println("调用前的值："+"a="+a+",b="+b);
        ExchangeDemo ed=new  ExchangeDemo();
        ed.ec(a,b);
        System.out.println("调用后的值："+"a="+a+",b="+b);
    }
}
