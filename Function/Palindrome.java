import java.util.*;
public class Palindrome {
    public static boolean similar(int n){
        int rem;
        int temp=n;
        int p=0;
        while (n>0){
            rem=n%10;
            p=p*10+rem;
            n/=10;
        }
        if (p==temp){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.:");
        int n= sc.nextInt();
        System.out.println("palindrome:"+similar(n));

    }
}
