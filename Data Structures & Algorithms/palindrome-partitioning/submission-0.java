class Solution {

    public boolean isPalindrome(String s){
        int l = 0;
        int r = s.length()-1;
        while(l<=r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public void solve(int index, String s,List<List<String>>ans,List<String>temp){

        if(index >= s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int j = index;j<s.length();j++){
            if(isPalindrome(s.substring(index,j+1))){
                temp.add(s.substring(index,j+1));
                solve(j+1,s,ans,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {

        List<List<String>>ans = new ArrayList<>();
        if(s.length() == 0 || s == null){
            return ans;
        }

        solve(0,s,ans,new ArrayList<>());
        return ans;
    }
}
