import java.util.*;
public class Swichcase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose 2/4/6");
        int a=sc.nextInt();
        switch (a)
        {
            case 2:
            {
                System.out.println("samosa");
                break;
            }
            case 4:
            {
                System.out.println("Burger");
                break;
            }
            case 6:
            {
                System.out.println("Mango Shake");
                break;
            }
            default:
            {
                System.out.println("Dreaming");
            }
        }
    }
}
