import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {

    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int []arr= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(majorityElement(arr));
    }
    static int majorityElement(int []nums){
        /*time compalaxity O(n^2) */


        // int count =0;
        // for(int i =0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[j]==nums[i]){
        //             count++;
        //         }
        //     }
        //     if(count>nums.length/2){
        //         return nums[i];
        //     }
        // }
        // return -1;


        /*We are creating a hashmap to store the value and its count 
        and putting  to default value 0  and incresing the count by 1
        if same value is present ans checkeing if its count is greater than n/2 
                     Better approch  */

    //     HashMap<Integer,Integer> map= new HashMap<>();
    //     for(int i =0;i<nums.length;i++){
    //         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        
    //     if(map.get(nums[i])>nums.length/2){
    //         return nums[i];
    //     }
    // }
    //     return -1;




        /*Moore voting algorithm  Optimal approch */

        int count =0;
        int element=0;
        for(int i=0;i<nums.length;i++){
            if(count ==0){
                count =1;
                element= nums[i];
            }
            else if (nums[i]==element){
                count ++;
            }else count--;
        }

        int count1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element){
                count1++;
            }
            if(count1>(nums.length/2)){
                return element;
            }
        }
        return -1;

    
    }
}