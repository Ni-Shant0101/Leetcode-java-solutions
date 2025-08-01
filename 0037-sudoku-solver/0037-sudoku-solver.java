class Solution {
    public void solveSudoku(char[][] board) {

         solve(board);
    }

    private boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                // Check if cell is empty
                if (board[row][col] == '.') {
                    // Try digits 1 to 9
                    for (char num = '1'; num <= '9'; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num; // Place digit

                            // Recursively solve for next cell
                            if (solve(board)) return true;

                            board[row][col] = '.'; // Backtrack
                        }
                    }
                    return false; // No valid digit found
                }
            }
        }
        return true; // Solved
    }

    // Check if placing `num` is valid
    private boolean isValid(char[][] board, int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            // Check row, column, and 3x3 box
            if (board[row][i] == num || board[i][col] == num ||
                board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == num) {
                return false;
            }
        }
        return true;
        
    }
}