public class functionoverloadingusingdatatypes {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(2,4));
        System.out.println(sum(2.15f,2.4f));
    }
}
