
public class Bsearching {
    public static int B_search(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if (arr[mid]<key){
                start=mid+1;
            }else if (arr[mid]==key){
                return mid;
            }
            else {
                end=mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] m) {
        int arr[]={1,3,4,5,7,9};
        int key =4;
        System.out.println(B_search(arr,key));
    }
}
