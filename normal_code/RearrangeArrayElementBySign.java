import java.util.Scanner;

public class RearrangeArrayElementBySign {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int []arr= new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int []ans=arrangeArray(arr);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
    static int [] arrangeArray(int[]nums){
        /* time complexity O(n) and space complexity O(n) solution is optimal 
        varation 1 arr[3,1,-2,-5,2,-4]*/
        int n = nums.length;
        int []ans= new int [n];
        int pos=0;
        int neg=1;
        for(int i=0;i<n;i++){
            if(pos<n){
                ans[pos]=nums[i];
                pos+=2;
            }
            else {
                ans[neg]=nums[i];
                neg+=2;
            }
        }
        return ans;
    }
}
