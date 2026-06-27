public class MaximumSumSubarrayOfSizeK{
    public static void main(String []args){
        int[] arr = {2,1,5,1,3,2};
        int k= 3;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int max=sum;
        for(int i=k;i<arr.length;i++){
            sum= sum- arr[i-k]+arr[i];
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
}