public class pwprinting {
    public static void p_w(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=15;j++){
                if ((i==1&&(j<=2||j==5||j==15))||(i==2&&(j==1||j==3||j==6||j==14))||(i==3&&(j<=2||j==7||j==13))||(i==4&&(j==1||j==8||j==10||j==12))||(i==5&&(j==1||j==9||j==11))){
                    System.out.print(" "+"*"+" ");
                }
                else {
                    System.out.print(" "+" "+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p_w();
    }
}