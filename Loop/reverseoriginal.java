import java.util.*;
public class reverseoriginal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        for(int k=n;k>0;k/=10) {
            int j=n%10;
            rev = rev*10 + j;
            n/=10;
        }
        System.out.println(rev);


    }
}
