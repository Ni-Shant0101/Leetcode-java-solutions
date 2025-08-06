class Solution {
    public String convertToTitle(int columnNumber) {
        
         StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // To make it 0-indexed
            int remainder = columnNumber % 26;
            result.append((char)(remainder + 'A'));
            columnNumber = columnNumber / 26;
        }

        return result.reverse().toString();
    }
}