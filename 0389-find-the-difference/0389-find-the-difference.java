class Solution {
    public char findTheDifference(String s, String t) {
        

        int sum = 0;
        
        // Add all characters of t
        for (char c : t.toCharArray()) {
            sum += c;
        }
        
        // Subtract all characters of s
        for (char c : s.toCharArray()) {
            sum -= c;
        }
        
        return (char) sum;
    }
}