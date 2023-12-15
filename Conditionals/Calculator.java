import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("CALCULATOR");
        System.out.print("Enter a no.:");
        int num1=sc.nextInt();
        System.out.print("Choose operation +,-,*,/,%:");
        char ch=sc.next().charAt(0);
        System.out.print("Enter a no.:");
        int num2=sc.nextInt();
        switch (ch)
        {
            case '+': {
                System.out.println(num1 + num2);
                break;
            }
            case '-':{
                System.out.println(num1-num2);
                break;
            }
            case '*':{
                System.out.println(num1*num2);
                break;
            }
            case '/':{
                System.out.println(num1/num2);
                break;
            }
            case '%':{
                System.out.println(num1%num2);
                break;
            }
            default:{
                System.out.println("ERROR");
            }

        }

    }
}
