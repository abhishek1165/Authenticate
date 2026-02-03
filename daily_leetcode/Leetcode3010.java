import java.util.Arrays;
import java.util.Scanner;

public class Leetcode3010{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int []arr= new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(numOfPairs(arr));
        sc.close();

    }
    static int numOfPairs(int []nums){
       /*time complexity O(n^3) and space complexity O(1)
        brute force approach to find the sum of every triplet and return the minimum sum
       failing for 10 3 1 1 as it gives 5 instead of 12*/

        // int n = nums.length;
        // int ans = Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             int sum = nums[i]+nums[j]+nums[k];
        //             ans = Math.min(ans, sum);
        //         }
        //     }
        // }
        // return ans;



       /*better approach is to use three variables to store the smallest three values
       returning the sum of first three elements after sorting
       time complexity O(nlogn) and space complexity O(1)*/
        
        //   Arrays.sort(nums);
        //  return nums[0]+nums[1]+nums[2];


        /*optimal approach by sotoring the smallest two values in two variables 
        and adding them to the first element after sorting 
        time complexity O(n) and space complexity O(1) */
       
        int n = nums.length ;
        int firstidx= nums[0];
        int f1=Integer.MAX_VALUE;
        int f2=Integer.MAX_VALUE;

        for(int i =1;i< n;i++){
            if(nums[i]<f1){
                f2=f1;
                f1=nums[i];
            }
            else if(nums[i]<f2){
                f2=nums[i];
            }
        }
        return firstidx+f1+f2;

    }
}