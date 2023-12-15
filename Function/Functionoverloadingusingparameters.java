public class Functionoverloadingusingparameters {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
//    public static float sum(int a,int b){
//        return a+b;
//    }
public static void main(String[] args) {
    int a=2;
    int b=5;
    int c=10;
    System.out.println(sum(a,b));
    System.out.println(sum(a,b,c));
}
}
