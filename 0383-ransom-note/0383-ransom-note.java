class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
int[] count = new int[26]; // For a-z

        for (char c : magazine.toCharArray()) {
            count[c - 'a']++; // Count each letter in magazine
        }

        for (char c : ransomNote.toCharArray()) {
            count[c - 'a']--; // Use a letter
            if (count[c - 'a'] < 0) {
                return false; // Not enough letters
            }
        }

        return true;

    }
}