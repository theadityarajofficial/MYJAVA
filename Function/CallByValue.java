import java.util.*;
public class CallByValue {
//    public static void swap(){
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int temp=b;
//        b=a;
//        a=temp;
//        System.out.println("a="+a);
//        System.out.println("b="+b);
//    }
    public static void swap2(int a,int b){
        int temp=a;
        a=b;
        b=temp;

        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        swap2(a,b);
    }
}
