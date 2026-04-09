package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets {

    public static void main(String[] args) {

        int [] nums ={1,2};

        System.out.println(subsets(nums));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(0, nums, new ArrayList<>(), result);
        return result;
    }

    private static void helper(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // take
        current.add(nums[index]);
        helper(index + 1, nums, current, result);

        // not take
        current.remove(current.size() - 1);
        helper(index + 1, nums, current, result);
    }
}