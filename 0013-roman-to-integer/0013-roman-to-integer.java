class Solution {
    public int romanToInt(String s) {
         HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = map.get(s.charAt(i));

            // If this is not the last char and the next char has a greater value
            if (i < s.length() - 1 && currentVal < map.get(s.charAt(i + 1))) {
                total -= currentVal; // subtract
            } else {
                total += currentVal; // add
            }
        }

        return total;
    }
}