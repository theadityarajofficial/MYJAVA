import java.util.*;
public class BinomialCoefficient {
    public static int Binomial(int n,int r)
    {
        int nf=1;
        int rf=1;
        int n_r=n-r;
        int n_rf=1;
        for (int i=1;i<=n;i++)
        {
            nf*=i;
        }
        for (int i=1;i<=r;i++)
        {
            rf*=i;
        }
        for (int i=1;i<=n_r;i++)
        {
            n_rf*=i;
        }
        int Bc=nf/(rf*(n_rf));
        return Bc;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.println("Enter r (r<n):");
        int r=sc.nextInt();
        int BinoCoef=Binomial(n,r);
        System.out.print("Binomial Coefficient is:");
        System.out.println(BinoCoef);
    }
}
