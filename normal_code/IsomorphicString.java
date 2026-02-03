import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        System.out.println(isIsomorphic(str1, str2));
        sc.close();
    }
    
     static boolean isIsomorphic(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int n = s1.length();
        HashMap<Character,Character> s1map = new HashMap<>();
        HashMap<Character,Character> s2map = new HashMap<>();
        for(int i = 0; i < n; i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(s1map.containsKey(ch1)){
                if(s1map.get(ch1) != ch2){
                    return false;
                }
            } else {
                s1map.put(ch1, ch2);
            }
            if(s2map.containsKey(ch2)){
                if(s2map.get(ch2) != ch1){
                    return false;
                }
            } else {
                s2map.put(ch2, ch1);
            }
        }
        return true;
    }
    
}