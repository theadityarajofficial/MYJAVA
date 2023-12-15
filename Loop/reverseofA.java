import java.util.*;
public class reverseofA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        do {
            int x=A%10;
            System.out.print(x);
            A=A/10;
        }while(A>0);
    }
}
