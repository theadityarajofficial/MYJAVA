import java.util.*;
public class product {
    public static int multiply(int a,int b){
        int pro=a*b;
        return pro;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        int prod=multiply(x,y);
        System.out.print(prod);
    }
}
