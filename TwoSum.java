import java.util.*;
import java.io.*;

public class TwoSum {

    public static void main(String args[]) {

        int[] Array = {1, 45, 6, 2, 4, 3};
        int N = 10;
        int arr_size = Array.length;
        int Ans = 0;
        if(TwoSumProblem(Array, N, arr_size))
        {
            Ans++;
            System.out.println("Array has two elements equal to the given sum: " + Ans);
        }
        else
        {
            System.out.println("Array does not have two elements equal to the given sum");

        }
    }
    static boolean TwoSumProblem (int[] Array, int sum, int arr_size) {
        int i, j;

        Arrays.sort(Array);
        i = arr_size - 1;
        j = 0;
        int Answer = 0;
        while (j < i) {
        if (Array[i] + Array[j] == sum)
            return true;
         else if (Array[i] + Array[j] < sum)
            j++;
         else
            i--;
    }
    return false;
    }
}