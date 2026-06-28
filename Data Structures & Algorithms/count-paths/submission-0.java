class Solution {
    public int solve(int i,int j){
        if(i ==0 && j == 0){
            return 1;
        }
        if(i < 0 || j < 0){
            return 0;
        }

        int left = solve(i,j-1);
        int top = solve(i-1,j);

        return left + top;
    }
    public int uniquePaths(int m, int n) {

        int ways = solve(m-1,n-1);
        return ways;
    }
}
