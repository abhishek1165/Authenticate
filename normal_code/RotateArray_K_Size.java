import java.util.Scanner;

public class RotateArray_K_Size {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        int []arr= new int [n];
        for(int i= 0;i< n ;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        int ans= rotate(arr,k);
        for(int nums:arr){
            System.out.print(nums+" ");
        }
    }
    static  int rotate( int []arr,int k){
        int n =arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        return 0;
    
    }       
    static void  reverse(int []arr,int  start , int end){
      while (start < end) {
         int temp= arr[start];
         arr[start ]=arr[end];
         arr[end]= temp;
         start++;
         end--;
        
      }
    }
}