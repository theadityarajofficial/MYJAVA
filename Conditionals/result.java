import java.util.*;
public class result {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks obtained");
        int marks=sc.nextInt();
        String st=(marks>=33)?"PASS":"FAIL";
        System.out.println(st);
    }
}
