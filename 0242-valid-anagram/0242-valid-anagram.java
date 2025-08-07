class Solution {
    public boolean isAnagram(String s, String t) {
        
         if (s.length() != t.length()) return false;

        int[] count = new int[26]; // for 26 lowercase letters

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // increase count for s
            count[t.charAt(i) - 'a']--; // decrease count for t
        }

        for (int c : count) {
            if (c != 0) return false; // mismatch in frequency
        }

        return true;
    }
}