import java.util.*;
public class factorial {
    public static long CalculateFactorial(int a){
        long f=1;
        for (int i=1;i<=a;i++){
            f*=i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(CalculateFactorial(a));
    }
}
