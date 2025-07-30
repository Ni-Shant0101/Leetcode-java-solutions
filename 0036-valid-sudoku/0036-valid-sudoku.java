class Solution {
    public boolean isValidSudoku(char[][] board) {
        
         // Create sets to track digits
        HashSet<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    // Create unique keys for row, col, and block
                    String rowKey = num + " in row " + i;
                    String colKey = num + " in col " + j;
                    String blockKey = num + " in block " + (i / 3) + "-" + (j / 3);

                    // If any key already exists → invalid
                    if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(blockKey)) {
                        return false;
                    }
                }
            }
        }

        return true; // All checks passed



    }
}