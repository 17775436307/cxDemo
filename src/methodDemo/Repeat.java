package methodDemo;

public class Repeat {
    public int plus(int a,int b){
        return a+b;
    }
    public double plus(double a,double b){
        return a+b;
    }
    public int plus(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] array={12,13,15,16,19,52};
        int x=16,y=26;
        double j=12.36,k=56.123;
        Repeat me=new Repeat();
        System.out.println("int的和："+me.plus(x,y));
        System.out.println("double的和："+me.plus(j,k));
        System.out.println("array的和："+me.plus(array));
    }
}
