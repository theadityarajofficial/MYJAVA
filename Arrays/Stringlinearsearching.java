import java.util.*;
public class Stringlinearsearching {
    public static String hotel_menu(String menu[],String st){
        for (int i=0;i< menu.length;i++){
            if (menu[i]==st){
                return st;
            }
        }
        return "no";

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String menu[]={"Dosa","Chole Bhature","Samosa"};
        String st= sc.next();
        String available=hotel_menu(menu,st);
        if (available==st){
            System.out.println(available);
        }else {
            System.out.println("not available");
        }
    }
}
