package aginDemo;

public class Final {
    public static void main(String [] args){
        int k=0;
        for(int i=1;i<5;i++){
            for(int j=1;j<5;j++){
                k=i+j;
                if(j==3) break;
                System.out.println("此时的i值为:"+i+" "+"此时的j值为"+j+" "+"k="+k);
            }
        }
        System.out.println("k="+k);
    }
}
