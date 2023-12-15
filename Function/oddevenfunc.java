import java.util.*;
public class oddevenfunc {
    public static boolean isEven(int n){
        if (n%2!=0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isEven(n));
    }
}
