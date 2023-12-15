import java.util.*;
public class linearsearching {
    public static int l_search(int arr[],int n){
        for (int i=0;i< arr.length;i++){
            if(arr[i]==n){
//                System.out.println("arr["+i+"]="+10);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]={2,4,6,8,10,12,14,16};
        int index=l_search(arr,n);
        if (index==-1){
            System.out.println("Key not found");
        }
        else {
            System.out.println(index);
        }
    }
}
