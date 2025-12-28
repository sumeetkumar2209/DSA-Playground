package dsa.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/*
* Question : https://neetcode.io/problems/two-integer-sum/question
*/

public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();

        return IntStream.range(0, nums.length)
        .filter(i -> {
            int val = target - nums[i];
            if (m.containsKey(val)) {
                return true;
            }
            m.put(nums[i], i);
            return false;
        }).mapToObj(i -> new int[]{m.get(target - nums[i]), i})
        .findFirst()
        .orElse(new int[]{});
       
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
