import javax.sound.midi.Soundbank;
import java.util.*;
public class BinomialCoefficient2 {
    public static int rfactorial(int r)
    {
        int rf=1;
        for (int i=1;i<=r;i++)
        {
            rf*=i;
        }
        return rf;
    }
    public static int nfactorial(int n)
    {
        int nf=1;
        for (int i=1;i<=n;i++)
        {
            nf*=i;
        }
        return nf;
    }
    public static int n_rfactorial(int n_r)
    {
        int n_rf=1;
        for (int i=1;i<=n_r;i++)
        {
            n_rf*=i;
        }
        return n_rf;
    }
    public static int factorial(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.print("Enter r (r<n):");
        int r=sc.nextInt();
        int Bc=nfactorial(n)/(rfactorial(r)*n_rfactorial(n-r));
        return Bc;
    }

    public static void main(String[] args) {
        System.out.println(factorial());
    }
}
