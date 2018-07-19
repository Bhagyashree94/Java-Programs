package com.company;
import java. util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.*;
public class HashMapDemo {

        public static void main (String args[]){

        HashMap <String, Integer> Map = new HashMap <String, Integer>();

        Map.clear();

        Map.put("Bhagyashree", 2);
        Map.put("Gawade", 5);
        Map.put("Jidnyesh", 4);
        Map.put("Sankhe", 1);

        System.out.println("Size of the Map: " +Map.size());

        if(Map.containsKey("Bhagyashree"))
            System.out.println("The Key is present in the Map");
        else if (Map.containsValue(5)){
            System.out.println("The value is present in the Map");
        }
        //Get a set of the entries
        Set set = Map.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        //Display Elements of the Map
        while(i.hasNext()){
            Map.Entry me = (Map.Entry) i.next();
            System.out.println(me.getKey()+ "");
            System.out.println(me.getValue());
        }

        //Deposite 10 to Jidnyesh's Account

        int balance = (int)Map.get("Jidnyesh");
        Map.put("Jidnyesh", balance + 10);
        System.out.println("Jidnyes's new balance is: " +Map.get("Jidnyesh"));

    }
}
