package methodDemo;

public class ExchangeAble {
    //可变参数列表（可变参数元），有了可变参数元了方法，就不可以在定义一个数组类的方法了，因为会判断两个是一个类型的方法，而不是方法重载
    public void ea(int a, int... n) {
           boolean flag=false;
        for (int a1 : n) {
            if (a1 == a) {
                  flag=true;
                  break;
            }
        }
            if(flag){System.out.println("找到了：" + a);
        }else {
                System.out.println("没找到"+a );
            }
    }
    public static void main(String[] args){
        ExchangeAble ec=new ExchangeAble();
        ec.ea(3,1,2,3,4,5,6);
        int[] arr={9,6,2,6};
        ec.ea(5,arr);//数组可以传值给可变参数列表，而可变参数不可以传值给数组
    }
}
