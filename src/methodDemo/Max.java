package methodDemo;

public class Max {
    //无返回值时要在后添加输出语句
    public void our(int a,int b){
        int max=0;
        if(a<b){
            max=b;
        }else{
            max=a;
        }
        System.out.println("a"+"和"+"b"+"的最大值为:"+max);

    }
    public static void main(String[] args){
        Max myMax=new Max();
        int i=3,j=123;
        myMax.our(i,j);

    }
}
