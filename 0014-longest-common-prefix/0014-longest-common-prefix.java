class Solution {
    public String longestCommonPrefix(String[] strs) {
         if (strs == null || strs.length == 0) return "";

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i); // take each character of first word

            for (int j = 1; j < strs.length; j++) {
                // check if index out of bounds or character mismatches
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0]; // all characters matched
        
    }
}