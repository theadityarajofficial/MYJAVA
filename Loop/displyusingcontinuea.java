import java.util.*;
public class displyusingcontinuea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i=0;;i++)
        {
            int n= sc.nextInt();
            if(n%10==0)
            {
                continue;
            }
            System.out.println(n);
        }
    }
}
