package vttp5_sdf_day08_permutations;

import java.util.*;

public class Permutations {

    public static void main(String[] args) {
        
        String testString = "ABCD"; 
        int stringLength = testString.length();
        int r = stringLength - 1; 

        // hash set to store permutations
        HashSet<String> permutations = new HashSet<String>();

        permutate(testString, 0, r, permutations);
        System.out.println(permutations);

    }

    // permutate function 
    private static void permutate(String str, int left, int right, HashSet<String> result) {
        
        // if left == right, we are at last char of string 
        // no more swapping necessary 
        if (left == right) {
            result.add(str);

        }

        else {

            // for every left before left == right
            for (int i = left; i <= right; i++) {

                // swap left char with i char 
                String swapped = swap(str, left, i);

                // permutate from left + 1 
                permutate(swapped, left + 1, right, result);

            }
        }

    }
    
    // swap characters function 
    private static String swap(String str, int i, int j) {

        // temp to hold first swapped char 
        char temp; 

        // char array to hold str in array 
        char[] charArray = str.toCharArray();

        // assign temp to first swapped char
        temp = charArray[i];

        // swap chars: i becomes j 
        charArray[i] = charArray[j]; 

        // swap chars: j becomes i (temp)
        charArray[j] = temp;

        return String.valueOf(charArray);

    }

  

}
