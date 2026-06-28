class Solution {
    public String longestPalindrome(String s) {
        
        if(s == null || s.length() == 0){
            return "";
        }

        int maxLen = Integer.MIN_VALUE;
        String ans = "";
        int start = 0;

        for(int i=0;i<s.length();i++){

            //for odd
            int l = i;
            int r = i;

            while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
                if(r-l+1 > maxLen){
                    start = l;
                    maxLen = r-l+1;
                }
                l--;
                r++;
            }

            //for even
            l = i;
            r = i+1;
            while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
                if(r-l+1 > maxLen){
                    start = l;
                    maxLen = r-l+1;
                }
                l--;
                r++;
            }
        }

        return s.substring(start,start+maxLen);
    }
}
