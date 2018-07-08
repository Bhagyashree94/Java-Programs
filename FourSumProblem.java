
package com.company;

public class FourSumProblem {

    public static void main(String args[]) {
        int[] Array = {-3, -5, -2, 6, 10, 2};
        int N = 0;
        int array_size = Array.length;
        int Ans;
        Ans = FourSum(Array, N, array_size);
        System.out.println("The Number of four elements that sum to zero are:" + Ans);
    }


    public static int FourSum(int[] Array, int Sum, int array_size) {
        int i, j, k, l;
        int Answer = 0;
        for (i = 0; i < array_size - 3; i++) {
            for (j = i + 1; j < array_size - 2; j++) {
                for (k = j + 1; k < array_size - 1; k++) {
                    for (l = k + 1; l < array_size; l++) {
                        if (Array[i] + Array[j] + Array[k] + Array[l] == Sum) {
                            Answer++;
                        }
                    }
                }
            }
        }
        return Answer;
    }
}