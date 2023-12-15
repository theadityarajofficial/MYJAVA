import java.util.*;
public class largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two no.");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if (num1>num2)
        {
            System.out.println(num1 + "is greater");
        }
        if (num1==num2)
        {
            System.out.println("both are equal");
        }
        else
        {
            System.out.println(num2+"is greater");
        }
    }
}
