class Solution {
    public int reverse(int x) {
         int rev = 0;

        while (x != 0) {
            int digit = x % 10; // get last digit
            x = x / 10;         // remove last digit

            // check for overflow/underflow before adding digit
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + digit; // build reversed number
        }

        return rev;
    }
}