package com.company;
import java.util.HashMap;
public class TwoSumConstructor {
    private int Target;
    private int[] array;

    TwoSumConstructor(int Target, int[] array) {
        this.Target = Target;
        this.array = array;
    }

    public int getTarget() {
        return Target;
    }

    public int[] getarray() {
        return array;
    }

    public static void main(String args []) {
        int[] Array1 = {2, 8, 4, 5, 6, 6};

        TwoSumConstructor ts = new TwoSumConstructor(11, Array1);
        ts.findtwoindexes();
    }

    public void findtwoindexes() {
        HashMap<Integer, Integer> Map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            if (Map.containsKey(array[i])) {
                System.out.println("The two numbers making the sum are: ");
                System.out.println(Map.get(array[i])+ "," + array[i]);
            } else {
                Map.put(Target - array[i], array[i]);
            }

        }

    }
}
