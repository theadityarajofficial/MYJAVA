import java.util.*;
public class rangeprime {

        public static boolean isPrime(int n){
            //corner cases
//        boolean isPrime=true;
            if (n==2) {
                return true;
            }
            for (int i=2;i<=n-1;i++)
            {
                if (n%i==0) {
                    return false;
                }
            }
            return true;
        }
    public static void primeinrange(int n){
            for (int i=2;i<=n;i++){
                if (isPrime(i)==true){
                    System.out.print(i+" ");
                }
            }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primeinrange(n);
    }
}
