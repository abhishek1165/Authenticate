import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LeaderInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n= sc.nextInt();    
        int[] arr= new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> ans = leaderInArray(arr);
        System.out.println("Leaders in array: " + ans);
    }
    static List<Integer> leaderInArray(int []nums){
         /*    time complexity O(n^2) and space complexity O(n) 
         
         */
        //  int n = nums.length;
        //  List<Integer> ans = new ArrayList();
        //  for(int i =0;i<n;i++){
        //     boolean leader= true;
        //     for(int j=i+1;j<n;j++){
        //         if(nums[j]>nums[i]){
        //             leader=false;
        //             break;
        //         }
        //     }
        //    if(leader==true){
        //     ans.add(nums[i]);
        //    }
        // }
        // return ans;


        /*   time complexity O(n) and space complexity O(n) */

        int  n = nums .length;
        List <Integer> ans= new ArrayList<>() ;
        int max= Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(nums[i]>max){
                ans.add(nums[i]);
                max=nums[i];
            }
        }
        Collections.reverse(ans);
        return ans;


    }
}
