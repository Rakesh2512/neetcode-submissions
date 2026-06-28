class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;

        // Validate rows
        for (int i = 0; i < n; i++) {
            Set<Character> rowSet = new HashSet<>();
            for (int j = 0; j < n; j++) {
                char ch = board[i][j];
                if (ch == '.') continue;
                if (rowSet.contains(ch)) return false;
                rowSet.add(ch);
            }
        }

        // Validate columns
        for (int j = 0; j < n; j++) {
            Set<Character> colSet = new HashSet<>();
            for (int i = 0; i < n; i++) {
                char ch = board[i][j];
                if (ch == '.') continue;
                if (colSet.contains(ch)) return false;
                colSet.add(ch);
            }
        }

        // Validate 3x3 boxes
        for (int boxRow = 0; boxRow < n; boxRow += 3) {
            for (int boxCol = 0; boxCol < n; boxCol += 3) {
                Set<Character> boxSet = new HashSet<>();
                for (int r = 0; r < 3; r++) {
                    for (int c = 0; c < 3; c++) {
                        char ch = board[boxRow + r][boxCol + c];
                        if (ch == '.') continue;
                        if (boxSet.contains(ch)) return false;
                        boxSet.add(ch);
                    }
                }
            }
        }

        return true;
    }
}
