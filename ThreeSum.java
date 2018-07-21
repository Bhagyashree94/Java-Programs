package com.company;

import java.util.HashMap;

public class ThreeSum {
    public static void main(String args[]){
        int [] Array = {2, 4, 3, 1 ,4, 3};
        int target = 8;
        int [] Answer = new int[3];
        Three_sum(Array, target);
        //    Answer = Three_sum(Array, target);
          //  System.out.println("The three numbers are: " + Answer[0] + Answer[1] + Answer[2]);
    }


    public static void Three_sum(int Arr [], int T){


        HashMap <Integer, int []> map = new HashMap<Integer, int[]>();
        System.out.println("The three numbers are: ");
        for(int i =0; i<Arr.length-1; i++){
            map.clear();

                for(int j=i+1; j<Arr.length;j++){
                    if(map.containsKey(Arr[j])){
                       int [] a = map.get(Arr[j]);

                        System.out.println(a[0] +","+ a[1]+ "," +Arr[j]);
                    }
                    else{
                        map.put (T- (Arr[i] +Arr[j]), new int []{Arr[i],Arr[j]});

                    }

                }

        }

    }
}
