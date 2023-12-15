import java.util.Scanner;
public class circlearea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pi=3.14f;
        System.out.println("Enter radius of circle");
        float radius=sc.nextInt();
        float area=pi*radius*radius;
        System.out.print("Area of circle is:");
        System.out.println(area);
        System.out.println("Hii");
        sc.close();
    }
}