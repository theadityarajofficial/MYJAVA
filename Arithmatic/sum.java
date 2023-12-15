import java.util.Scanner;
public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println(num1);
        int num2=sc.nextInt();
        System.out.println(num2);
        int sum=num1+num2;
        System.out.println("sum of num1 and num2 is:");
        System.out.println(sum);
    }
}