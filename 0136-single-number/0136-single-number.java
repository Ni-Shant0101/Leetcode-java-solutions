class Solution {
    public int singleNumber(int[] nums) {

         int result = 0;
        for (int num : nums) {
            result ^= num; // XOR with each number
        }
        return result;
        


    }
}