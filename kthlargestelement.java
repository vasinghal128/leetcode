import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int l = nums[nums.length-k];
        return l;
    }
}