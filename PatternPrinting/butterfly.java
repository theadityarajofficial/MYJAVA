import java.util.*;
public class butterfly {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.printf("*");
            }
            for (int j=1;j<=2*n-2*i;j++)
            {
                System.out.printf(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.printf("*");
            }
            System.out.println();
        }
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            for (int j=0;j<2*i;j++)
            {
                System.out.printf(" ");
            }
            for (int j=0;j<n-i;j++)
            {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
