class Solution {
    public int[] findErrorNums(int[] nums) {

 int n = nums.length;
        int[] freq = new int[n + 1];
        int dup = -1, missing = -1;

        // Count frequency
        for (int num : nums) {
            freq[num]++;
        }

        // Find duplicate and missing
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                dup = i;
            } else if (freq[i] == 0) {
                missing = i;
            }
        }

        return new int[]{dup, missing};

        
    }
}