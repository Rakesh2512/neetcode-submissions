class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int  maxLen = 0;
        int n = s.length();

        for(int i =0;i<n;i++){
            Set<Character>st = new HashSet<>();
            int curLen = 0;
            for(int j=i;j<n;j++){
                st.add(s.charAt(j));
                if(st.size() > 2){
                    break;
                }
                curLen++;
            }
            maxLen = Math.max(curLen,maxLen);
        }
        return maxLen;
    }
}