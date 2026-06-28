class Solution {
    public String longestPalindrome(String s) {
        
        int n = s.length();

        int maxLen = 0;
        int Index = 0;
        
        for(int i = 0;i<n;i++){

            // for odd length
            int j = i;
            int k = i;
            while( j>=0 && k < n && s.charAt(j) == s.charAt(k)){

                if(maxLen < k-j+1){
                    maxLen = k-j+1;
                    Index = j;
                }
                j--;
                k++;
            }
        }

        for(int i = n-1;i>=0;i--){
            // for even length
            int j = i;
            int k = i+1;

            while( j>=0 && k < n && s.charAt(j) == s.charAt(k)){
                if(maxLen < k-j+1){
                    maxLen = k-j+1;
                    Index = j;
                }
                j--;
                k++;
            }
        }

        return s.substring(Index,Index+maxLen);
    }
}
