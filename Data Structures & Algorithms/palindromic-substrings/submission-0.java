class Solution {

    public int solve(String s,int l,int r){
        int count = 0;
        while( l>=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
            count++;
        }

        return count;
    }
    public int countSubstrings(String s) {
        
        int n = s.length();
        if(n == 0){
            return 0;
        }

        int count = 0;

        for(int i =0;i<n;i++){
            count+= solve(s,i,i);
            count+= solve(s,i,i+1);
        }

        return count;
    }
}
