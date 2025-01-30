package data_structures;
class Solution {
    //correct ans using brute force
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");


    }

    //using subtract target or hash.map

}
public class Array_3_twoSums {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] ans = s.twoSum(new int[]{3,3},6);
        System.out.println(ans[0]+","+ans[1]);
    }
}
