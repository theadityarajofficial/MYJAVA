import java.util.*;
public class sumnnatural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a natural no.:");
        int n=sc.nextInt();
        int i=0;
        int sum=0;
        while (i<=n)
        {
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
