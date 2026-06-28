class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int n = board.length;
        int m = board[0].length;

        for(int i =0;i<n;i++){

            Set<Character>st1 = new HashSet<>();
            Set<Character>st2 = new HashSet<>();
            Set<Character>st3 = new HashSet<>();
            for(int j =0;j<m;j++){

                // to check row 
                if(board[i][j] != '.'){
                    if(st1.contains(board[i][j])){
                        return false;
                    }
                    st1.add(board[i][j]);
                }
                // to check col

                if(board[j][i] != '.'){
                    if(st2.contains(board[j][i])){
                        return false;
                    }
                    st2.add(board[j][i]);
                }


                //to check box

                int row = (i/3)*3;
                int col = (i%3)*3;

                if(board[row+j/3][col+j%3] != '.'){
                   if(st3.contains(board[row+j/3][col+j%3])){
                        return false;
                    }
                    st3.add(board[row+j/3][col+j%3]);
                }
            }
        }

        return true;
    }
}
