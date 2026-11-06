import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Add all numbers into HashSet
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Check every number
        for (int num : set) {

            // Start only if previous number is absent
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                // Count consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                // Update longest sequence
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}