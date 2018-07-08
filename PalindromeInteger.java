package com.company;

public class PalindromeInteger {

    public static void main (String [] args){
        int N = 1234;
        String str = Integer.toString(N);
        String Answer = CheckPalindrome(N);

        }



    public static String CheckPalindrome(int n){

        //Convert this integer to a string
        int A=0;
        String str = Integer.toString(n);
        String new_string = "";
        int str_len, i;
        str_len = str.length();
        for(i=str_len-1;i>=0; i--){
           new_string  +=str.charAt(i);
        }
        n = Integer.parseInt(str);
        int n1 = Integer.parseInt(new_string);

        A = n+ n1;

        String Final_Str = Integer.toString(A);

        return Final_Str;
    }

}
