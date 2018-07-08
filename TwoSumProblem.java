package com.company;

public class TwoSumProblem {

    public static void main(String args[]) {
        int Answer = 0;
        int[] Array = {-5, -2, 6,3,-3, 2};
        int N = 0;
        int array_size = Array.length;

        Answer=FourSum(Array, N, array_size);

        System.out.println("The Number of four elements that sum to zero are:" +Answer);


    }

    public static int FourSum(int []Array, int target, int array_size){
        int i,j;
        target =0;
        int answer=0;
        int compliment = 0;
        for(i=0; i<array_size-1; i++){
            compliment = target - Array[i];
            for(j=i;j<array_size;j++){
                if (Array[j]==compliment)
                    answer++;
            }
        }
        return answer;
            }
        }




