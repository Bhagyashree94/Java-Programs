package com.company;

public class SecondLastWord {

    public static void main (String Args[]){
        String A = "How are you doing?";
       // String new_string = "";
        System.out.println("The second last word of the sentence is: " +SecondLast(A) );
    }


    public static String SecondLast(String Line)
    {
        String [] B = Line.split(" ");

        return B[2];
    }

}
