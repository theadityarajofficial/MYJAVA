import java.util.*;
public class incometax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your income");
        int inc=sc.nextInt();
        float tax;
        System.out.println("Total tax");
        if(inc>1000000)
        {
            tax =inc/100f*30;
        } else if (inc<1000000&&inc>500000) {
            tax =inc/100f*20;
        }
        else
        {
            tax=0;
        }
        System.out.println(tax);
    }
}
