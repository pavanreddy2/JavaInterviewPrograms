package com.javaBatch9;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DeleteAnElemetFromArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int removeElement = 1;
        int[] newArray = remove(originalArray, removeElement);
        System.out.println(Arrays.toString(originalArray));
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] remove(int[] elements, int removeElement) {

/*        int[] newArray = IntStream.of(elements)
                .filter(element -> element != removeElement)
                .toArray();

        return newArray;
    }*/
        // Step 1: Initialize a variable to count elements to be removed.
        int count = 0;

        // Step 2: Count the number of elements to remove.
        for (int element : elements) {
            if (element != removeElement) {
                // If the current element is not equal to the removeElement, increment the count.
                count++;
            }
        }
        // Step 3: Create a new array without the removed element.
        int[] newArray = new int[count];
        int index = 0; // Index for the new array.

        // Step 4: Copy elements from the original array to the new array while excluding the removeElement.
        for (int element : elements) {
            if (element != removeElement) {
                // If the current element is not equal to the removeElement, add it to the new array.
                newArray[index] = element;
                index++; // Move to the next position in the new array.
            }
        }
        // Step 5: Return the newArray, which contains the elements from the original array with the removeElement removed.
        return newArray;
    }

}

//output: {1,2,3,4};