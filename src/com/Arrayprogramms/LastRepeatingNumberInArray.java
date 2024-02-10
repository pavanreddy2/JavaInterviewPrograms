package com.Arrayprogramms;

public class LastRepeatingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,2,4,3,5,67,7,8,9,9,300};

        int lastRepeating = -1; // variable to store the last repeating number

// iterate through the array backwards
        for (int i = arr.length - 1; i >= 0; i--) {
            // check if the current element is repeated earlier in the array
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    lastRepeating = arr[i]; // update the last repeating number
                    break; // no need to check earlier elements, since we want the last one
                }
            }
            // if we have found the last repeating number, we can stop iterating
            if (lastRepeating != -1) {
                break;
            }
        }

// print the last repeating number, if any
        if (lastRepeating != -1) {
            System.out.println("Last repeating number: " + lastRepeating);
        } else {
            System.out.println("No repeating numbers found.");
        }

    }
}
