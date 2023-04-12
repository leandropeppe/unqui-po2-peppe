package ar.edu.unq.po2.tp3;

import java.util.*;

public class Menu {

    public static void main(String[] args){
        int number = 12223;
        List<Integer> arr1 = new ArrayList<Integer>();
        
        while(number > 0){
        	arr1.add(number % 10);
            number = number / 10;
        }
        
         System.out.println(arr1);
    }
}