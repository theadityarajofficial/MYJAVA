import java.util.*;
public class reverseusingforloop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=n;i>0;i/=10)
        {
            int ld=i%10;
            System.out.print(ld);
        }
    }
}
