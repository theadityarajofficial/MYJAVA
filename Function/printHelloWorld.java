import java.util.*;
public class printHelloWorld {
    public static int printHello(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            System.out.println("Hello World");
        }
        return n;
    }
    public static void main(String[] args) {
        printHello();//function call
    }
}
