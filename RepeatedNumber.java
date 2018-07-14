package com.company;

import java.util.*;

public class RepeatedNumber {

    public static void main (String Args []) {
        int[] Array = {1, 2, 40, 5, 4, 2, 1, 5, 40, 40, 5, 6, 8, 10, 3};
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int count=0;

        do {
            count=Count(Array,Array[i],list);
            if(count==0)
                i++;
             else {
                System.out.println("The Number: " + Array[i] + " is repeated " + count + " times");
                i++;
            }}
            while (i < Array.length) ;

    }

    public static int Count(int A [], int a, ArrayList <Integer> L){
        int Counter=0;
       if(L.contains(a))
           Counter =0;

       else {
           for (int j = 0; j < A.length; j++) {
               if (a == A[j]) {
                   Counter++;
                   L.add(a);
               }
           }
       }
    return Counter;
    }
}
