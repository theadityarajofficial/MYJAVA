import java.util.*;
public class Hollowrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.:");
        int n = sc.nextInt();
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= n; j++) {
                if (i != 1 && i != n-1) {
                    if (j == 1 || j == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


}
