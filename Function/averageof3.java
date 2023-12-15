import java.util.*;
public class averageof3 {
    public static void avg(){
        Scanner sc=new Scanner(System.in);
        float a= sc.nextFloat();
        float b= sc.nextFloat();
        float c= sc.nextFloat();
        float average = (a+b+c)/3;
        System.out.println(average);
    }
    public static void main(String[] args) {
        avg();
    }
}
