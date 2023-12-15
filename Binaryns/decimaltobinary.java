import java.util.*;
public class decimaltobinary {
    public static int decBin(int n){
        int i=0;
        int bin=0;
        while (n>=1)
        {
            int rem=n%2;
            bin+=rem*Math.pow(10,i);
            i++;
            n/=2;
        }
       return bin;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(decBin(n));
    }
}
