import java.util.*;
public class Age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        if (age>=18)
        {
            System.out.println("Adult");
        } else if ((age<18)&&(age>12)) {
            System.out.println("Teenager");

        } else
        {
            System.out.println("Child");
        }
    }
}
