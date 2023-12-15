import java.util.*;
public class keepentering {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;;i++)
        {
            int x=sc.nextInt();
            if(x%10==0)
            {
                break;
            }
        }
    }
}
