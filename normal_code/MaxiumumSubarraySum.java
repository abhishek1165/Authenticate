import java.util.Scanner;

public class MaxiumumSubarraySum {
 
    public static void main(String []args){
        Scanner sc = new Scanner(System.in );
        int n =sc. nextInt();
        int arr[]=new int [n];
        for(int i=0;i< n;i++){
            arr[i]=sc.nextInt();
        }
        int ans= maxSubArray(arr);
        System.out.println(ans);
    }
    static int maxSubArray(int[]nums){

        /*Brute force approch  time complexity O(n^3) */

        
        //      int maxsum=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         int sum =0;
        //         for(int k=i;k<=j;k++){
        //             sum+=nums[k];
        //         }
        //         maxsum=Math.max(maxsum, sum);
        //     }
        // }
        // return maxsum;

        /*Optimized approch time complexity O(n^2) */

        // int maxsum=Integer.MIN_VALUE;
        // for(int i =0;i< nums.length;i++){
        //     int sum =0;
        //     for( int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //     }
        //     maxsum=Math.max(maxsum, sum);
        // }
        // return maxsum;

        /*Optimized approch time complexity O(n) */

        int maxsum=Integer.MIN_VALUE;
        int sum =0;
        for( int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxsum=Math.max(maxsum, sum);
            if(sum<0){
                sum=0;
            }
            if(maxsum>sum){
                maxsum=sum;
            }
        }
        return maxsum;
    }
 }