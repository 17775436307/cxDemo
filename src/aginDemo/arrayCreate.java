package aginDemo;
public class arrayCreate {
    public static void main(String [] args){
        //int[] wtf=new int[100];
        int wtf[]=new int[100];
        //String[] str=new String[100];
        String str[]=new String[100];
        //char ch[]=new char[100];
        char[] ch=new char[100];
        for(int i=0;i<=99;i++){
            wtf[i]=i+2;
        }
        for(int i=0;i<=99;i++){
            System.out.println("数组的第"+(i+1)+"个元素"+wtf[i]);
        }
     System.out.println("输出str[]第99个元素="+str[str.length-1]);
    }
}
