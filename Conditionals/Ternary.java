import java.util.*;
public class Ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int a=sc.nextInt();
        String x=(a%2==0)?"EVEN":"ODD";
        System.out.println(x);
    }
}
