
class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[][] next = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int count = 0;

                // Check 8 neighbours
                for (int r = i - 1; r <= i + 1; r++) {
                    for (int c = j - 1; c <= j + 1; c++) {

                        // Check boundaries and skip current cell
                        if (r >= 0 && r < m &&
                            c >= 0 && c < n &&
                            !(r == i && c == j)) {

                            if (board[r][c] == 1) {
                                count++;
                            }
                        }
                    }
                }

                // Apply Game of Life rules
                if (board[i][j] == 1) {
                    if (count == 2 || count == 3) {
                        next[i][j] = 1;
                    }
                } 
                else {
                    if (count == 3) {
                        next[i][j] = 1;
                    }
                }
            }
        }

        // Copy next generation into original board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = next[i][j];
            }
        }
    }
}
