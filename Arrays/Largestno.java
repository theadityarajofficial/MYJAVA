public class Largestno {
    public static void main(String[] args) {
        int arr[]={1,2,6,3,5};
        System.out.println("Largest value is: "+value(arr));
    }
    public static int value(int arr[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>largest){
                largest= arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest value is:"+smallest);
        return largest;
    }
}
