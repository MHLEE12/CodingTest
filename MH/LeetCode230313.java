public class LeetCode230313 {
    // 35. Search Insert Position(easy)
    // https://leetcode.com/problems/search-insert-position/description/?envType=study-plan&id=algorithm-i
    public int searchInsert(int[] nums, int target) {
        int result = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
            if(nums[i] < target) {
                result = i + 1;
            }
        }
        return result;
    }
}
