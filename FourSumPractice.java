package com.company;
import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Arrays;
public class FourSumPractice {

  //  private static final int[] Answer2 = {} ;
    private int Target;
    private int Array[];

    FourSumPractice(int Target, int []Array){
        this.Target = Target;
        this.Array= Array;
    }
    public int getTarget() {
        return Target;
    }
    public int [] getArray(){
        return Array;
    }
    public int [] TwoSum(int []nums, int Sum){
        HashMap <Integer, Integer> Map = new HashMap <Integer, Integer>();
     //   int [] Answer1 = new int[2];
        int [] Answer1 = new int[]{0,0};
        int i;
        for(i=0;i<nums.length; i++) {
            if (Map.containsKey(nums[i])) {
                Answer1 = new int[]{Map.get(nums[i]), nums[i]};
                return Answer1;

            } else
                Map.put(Sum - nums[i], nums[i]);
        }
            return Answer1;
    }

    public void FourSum() {
        System.out.println("The four elements are:");
        Arrays.sort(Array);

        for (int i = 0; i < Array.length - 3; i++) {
            for (int j = i+1; j < Array.length - 2; j++) {
                int rem_Sum = Target - (Array[i] + Array[j]);
                int[] rem_array = Arrays.copyOfRange(Array, j + 1, Array.length);
                int [] Answer = TwoSum(rem_array, rem_Sum);
              //  System.out.println(Arrays.toString(Answer) + " " + Array[i]+ " " + Array[j]);
                if (Answer[0] !=0 && Answer[1] !=0) {
                    System.out.println(Array[i]+ "," +Array[j]+ "," +Answer[0]+ "," +Answer[1] );
                }
            }
        }

    }

    public static void main(String args[]){

        int [] Array1 ={1,4,5,3,2,6,7,0};

        FourSumPractice fs = new FourSumPractice(12,Array1);
        fs.FourSum();

//        FourSumPractice fs2 = new FourSumPractice(9,Array1);
//        System.out.println("Here");
//        System.out.println(Arrays.toString(fs2.TwoSum(Array1,9)));

    }
}