public class reversingusingsecondarray {
    public static void reversing(int arr[]){
        int end=arr.length-1;
        for (int first=0;first<end;first++){
            int temp=arr[end];
            arr[end]=arr[first];
            arr[first]=temp;
            end--;
        }
        for (int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reversing(arr);
    }
}
