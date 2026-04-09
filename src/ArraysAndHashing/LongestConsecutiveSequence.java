package ArraysAndHashing;
import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Step 1: Add all elements to HashSet
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Check each number
        for (int num : set) {

            System.out.println(!set.contains(num -1));
            // Start sequence only if previous number doesn't exist
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                // Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        int result = longestConsecutive(nums);

        System.out.println("Longest Consecutive Sequence Length: " + result);
    }
}