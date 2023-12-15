import java.util.*;
public class charpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        char ch='A';
        for (int chars=0;chars<n;chars++)
        {
            for (int cha=0;cha<=chars;cha++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
