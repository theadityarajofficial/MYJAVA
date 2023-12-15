import java.util.*;
public class houseshaped {
    public static void patternp1(int n){
        for (int i=0;i<n;i++){
            for (int j=n;j>i;j--){
                System.out.print(" "+"*"+" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print(" "+" "+" ");
            }
            if (i==0){
                for (int j=n;j>i+1;j--){
                    System.out.print(" "+"*"+" ");
                }
            }
            else {
                for (int j=n-1;j>=i;j--){
                    System.out.print(" "+"*"+" ");
                }
            }
            System.out.println();
        }
    }
    public static void patternp2(int n){

        for (int i=1;i<=n;i++){
            for (int j=1;j<=2*n-1;j++){
                if (i==n||j==1||j==2*n-1){
                    System.out.print(" "+"*"+" ");
                }
                else {
                    System.out.print(" "+" "+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=9;
        patternp1(n);
        patternp2(n);
    }
}
