class Solution {
    public void solve(int n,List<String>ans,String temp,int open,int close){
        if(temp.length() == n*2){
            ans.add(temp);
            return;
        }

        if(open < n){
            solve(n,ans,temp+"(",open+1,close);
        }
        if(close < open){
            solve(n,ans,temp+")",open,close+1);
        }
    }
    public List<String> generateParenthesis(int n) {
        
        List<String>ans = new ArrayList<>();
        
        if(n == 0){
            return ans;
        }

        String temp = "";

        solve(n,ans,temp,0,0);
        return ans;
    }
}
