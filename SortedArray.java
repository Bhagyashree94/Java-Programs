package com.company;
import java.io.*;
import java.util.*;


public class SortedArray {

    public static void main(String[] args) {

        String A = "8,3,10,5,4,6";

        int [] B = StringtoArray(A);
        System.out.println(A);
        System.out.println("Sorted array:");
        for(int i=0; i<B.length; i++){

            System.out.print(B[i]);
        }
    }
    public static int[] StringtoArray(String A) {
        String[] B = A.split(",");
        int[] C = new int[B.length];
        int[] array= new int[C.length];

        for (int i = 0; i < B.length; i++) {
            C[i] = Integer.parseInt(B[i]);

        }

        int temp=0;
        for (int i = 0; i < C.length ; i++) {
            for (int j = 0; j < C.length-1; j++) {

                if (C[j] > C[j + 1]) {
                    temp = C[j];
                    C[j] = C[j + 1];
                    C[j + 1] = temp;
                }
            }
        }
        return C;

        }


    }



