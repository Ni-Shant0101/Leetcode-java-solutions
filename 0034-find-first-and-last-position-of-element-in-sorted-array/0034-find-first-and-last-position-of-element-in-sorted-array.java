class Solution {
    public int[] searchRange(int[] nums, int target) {

         int first = findPosition(nums, target, true);
        int last = findPosition(nums, target, false);
        return new int[]{first, last};
    }

    // Binary search function to find first or last position
    private int findPosition(int[] nums, int target, boolean findFirst) {
        int ans = -1;
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                if (findFirst) {
                    end = mid - 1; // Keep searching left
                } else {
                    start = mid + 1; // Keep searching right
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;

        
        
    }
}