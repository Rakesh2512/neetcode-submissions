class Solution {

    public int solve(String text1,int i,String text2,int j,int[][] dp){

        if(i == 0 || j == 0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(text1.charAt(i-1) == text2.charAt(j-1)){
            return dp[i][j] =  1 + solve(text1,i-1,text2,j-1,dp);
        }

        return dp[i][j] = Math.max(solve(text1,i-1,text2,j,dp),solve(text1,i,text2,j-1,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n+1][m+1];

        for(int[] r : dp){
            Arrays.fill(r , -1);
        }

        int ans = solve(text1,n,text2,m,dp);

        return ans; 
    }
}
