package com.company;
import java.util.*;
import java.util.Scanner;

public class ReverseString {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string you want to reverse: ");
        String Str = sc.next();
        System.out.println("The Reverse of the given String is: " +String_reverse(Str));
    }


    public static String String_reverse(String str){
         String Reverse = "";

         for(int i=str.length()-1; i>=0;i--){
             Reverse = Reverse + str.charAt(i);
         }
         return Reverse;

    }
}

