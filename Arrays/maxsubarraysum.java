public class maxsubarraysum {
    public static void maxsasum(int arr[]) {
        int max = Integer.MIN_VALUE;
        int sum=0;
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum+=arr[k];
                }
                ts++;
                System.out.println("sum=" +sum);
                if(sum>=max)
                {
                    max=sum;
                }
                sum=0;
            }

        }
        System.out.println("max="+max);
        System.out.println("Total subarray=" + ts);
    }

    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        maxsasum(arr);
    }

}
