import java.util.*;
public class LongestConsecutiveSequence {

    public static void main (String args[]){
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int []arr= new int[n];
      for( int i =0;i< n;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] nums) {
        /*brute force approch time complexity O(n^2) space complexity O(1) */
        int longest= 0;
        int n = nums.length;
        for( int i=0;i<n;i++){
            int count =1;
            for( int j=0;j<n;j++){
                if( nums[j]==nums[i]+1){
                    count ++;
                    nums[i]=nums[j];    
                }
            }
            longest = Math.max(longest,count);
        }
        return longest;
      
    }
}