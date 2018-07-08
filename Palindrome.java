public class Palindrome {

    public static void main (String [] args){
        String B = "13331";
        int str_len= B.length();
        if(FindPalindrome(B, str_len))
            System.out.println(" Yes!! The string is a palindrome");
        else
            System.out.println("No!! It is not a palindrome");

    }

    public static boolean FindPalindrome(String str, int str_len){
        int i;
        String n ="";
        for(i=str_len-1;i>=0; i--){
            n +=str.charAt(i);
        }
        if(str.equalsIgnoreCase(n))
            return true;
        else
            return false;
    }



}
