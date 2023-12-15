import java.util.*;
public class binarytodecimal {
    public static int bintodec(int n){
        int sum=0;
        int pow=0;
        while (n>0)
        {
            int j=n%10;
            sum+=j*(int)(Math.pow(2,pow));
            pow++;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int decSum=bintodec(n);
        System.out.println("decimal of "+n+" is: "+decSum);
    }
}
