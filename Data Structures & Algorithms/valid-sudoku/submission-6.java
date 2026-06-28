class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int n = board.length;
        int m = board[0].length;

        //To check each row
        for(int i =0;i<n;i++){
            Set<Character>st1 = new HashSet<>();
            for(int j=0;j<m;j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(st1.contains(board[i][j])){
                    return false;
                }
                st1.add(board[i][j]);
            }
        }

        // To check each col
        for(int i=0;i<n;i++){
            Set<Character>st2 = new HashSet<>();
            for(int j=0;j<m;j++){
                if(board[j][i] == '.'){
                    continue;
                }
                if(st2.contains(board[j][i])){
                    return false;
                }
                st2.add(board[j][i]);
            }
        }

        // To check each box

        for(int i=0;i<n;i+=3){
            for(int j=0;j<m;j+=3){

                Set<Character>st3 = new HashSet<>();
                for(int r =0;r<3;r++){
                    for(int c=0;c<3;c++){
                        char ch = board[r+i][c+j];
                        if(ch == '.'){
                            continue;
                        }
                        if(st3.contains(ch)){
                            return false;
                        }
                        st3.add(ch);
                    }
                }
            }
        }
        return true;
    }
}
