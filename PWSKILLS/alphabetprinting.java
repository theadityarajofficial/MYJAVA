import java.util.*;
public class alphabetprinting {
    public static void alphabetpattern(int ch){
        char c_h='A';
        for (int i=0;i<ch;i++){
            System.out.print(c_h);
            c_h++;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch= sc.nextInt();
        alphabetpattern(ch);
    }
}
