public class Nameprinting {
    public static void print(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=32;j++){
                if(j==10||j==14||j==17||((i==1)&&(j==5||j==11||j==13||j==15||j==16||j==18||j==19||j==23||j==28))||((i==2)&&(j==4||j==6||j==12||j==20||j==22||j==27||j==29))||((i==3)&&(j==3||j==4|j==5||j==6||j==7||j==12||j==21||j==26||j==27||j==28||j==29||j==30))||((i==4)&&(j==2||j==8||j==12||j==21||j==25||j==31))||((i==5)&&(j==1||j==9||j==11||j==13||j==15||j==21||j==24||j==32))){
                    System.out.print(" "+"*"+" ");
                }
                else {
                    System.out.print(" "+" "+" " );
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print();
    }
}
