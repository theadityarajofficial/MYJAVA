class Kanda_nes {
    public static void Kadanes(int arr[]){
        int currSum=0;
        int Maxsum=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if (currSum<0){
                currSum=0;
            }
            Maxsum=Math.max(Maxsum,currSum);
//            if (Maxsum<currSum){
//                Maxsum=currSum;
//            }
        }
        System.out.println("Max subarray sum="+Maxsum);
    }

    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        Kadanes(arr);
    }
}
