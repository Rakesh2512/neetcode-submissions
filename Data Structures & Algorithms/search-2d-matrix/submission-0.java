class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols-1;

        while(row<rows && col>=0){
            int mid = row+(col-row)/2;
            if(matrix[row][col] == target){
                return true;
            }
            if(target < matrix[row][col]){
                col = col-1;
            }
            else if(target > matrix[row][col]){
                row = row+1;
            }
        }
        return false;
    }
}
