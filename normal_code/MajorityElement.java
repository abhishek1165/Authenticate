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
        int count =0;
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count>nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
}