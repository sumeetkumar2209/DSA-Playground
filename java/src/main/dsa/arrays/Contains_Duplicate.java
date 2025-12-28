package dsa.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Question : https://neetcode.io/problems/contains-duplicate/question

public class Contains_Duplicate {

    public static void main(String[] args) {
        Contains_Duplicate containsDuplicate = new Contains_Duplicate();
        System.out.println(containsDuplicate.hasDuplicate_A1(new int[]{1,2,3,3}));
        System.out.println(containsDuplicate.hasDuplicate_A2(new int[]{1,2,3,3}));
    }

    // #Approach:1
    // TC : O(N) , SC : O(N)
    public boolean hasDuplicate_A1(int[] nums) {
        Set<Integer> duplicateSet = new HashSet<>();
        return Arrays.stream(nums).anyMatch(val -> !duplicateSet.add(val));
    }

    // #Approach:2
    // TC : O(N) , SC : O(1)
    public boolean hasDuplicate_A2(int[] nums) {
        return Arrays.stream(nums).distinct().count() != nums.length;
    }
}
