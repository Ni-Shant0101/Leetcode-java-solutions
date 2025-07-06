class Solution {
    public int lengthOfLastWord(String s) {

         s = s.trim(); // remove spaces from start and end
        String[] words = s.split(" "); // split by space
        String lastWord = words[words.length - 1]; // get last word
        return lastWord.length();
    }
}