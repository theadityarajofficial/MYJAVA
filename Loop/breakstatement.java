public class breakstatement {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<5;i++)
        {
            if (i==3)
            {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop");
    }
}
