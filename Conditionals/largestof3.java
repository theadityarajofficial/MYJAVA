import java.util.*;
public class largestof3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 no.");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>=b&&a>=c)
        {
            System.out.println(a +" is greatest");
        } else if (b>=a&&b>=c) {
            System.out.println(b +" is greatest");
        } else{
            System.out.println(c +" is greatest");
        }
    }
}
