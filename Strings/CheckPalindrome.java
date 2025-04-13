package Strings;
/*
   INTUIT

   Q>  Check if a String is a Palindrome
   "racecar", "noon" , "madam"
 */
public class CheckPalindrome {
    public static boolean isPalindrome(String str){
        for(int i = 0; i < str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not a palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "shourya";
        System.out.println(isPalindrome(str));
    }
}
