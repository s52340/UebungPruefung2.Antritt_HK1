package org.campus02.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayHelper {

    public static void main(String[] args) {

       int[] createdArray =  createIntArray(6, 45);
       // System.out.println("createdArray = " + Arrays.toString(createdArray));
        for (int i = 0; i < createdArray.length; i++) {
            int stelle = i + 1;
            System.out.println("Die Glückszahl an der Stelle " + stelle + " lautet: " + createdArray[i]);
        }

        int[] array = {1,2,3,4,2};
        boolean valid = validateTipp(array);
        System.out.println("valid = " + valid);

    }


    public static int[] createIntArray(int sizeOfArray, int maxValue){
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(maxValue+1);
        }
        return array;
    }

    public static boolean validateTipp(int[] array){
        boolean boo = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if ( i != j && array[i] == array[j]){
                    boo = false;
                    return false;
                }
            }
        }
        return boo;
    }
}
