import java.util.*;
public class Addition {
    private static int sum(int a,int b)//parameters or formal parameters
    {
        int add=a+b;
        return add;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int add=sum(x,y);//arguments or actual parameters
        System.out.println(add);
    }
}
