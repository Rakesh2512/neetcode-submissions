class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLength = 0;
        int left = 0;

        Set<Character>st = new HashSet<>();

        for(int right = 0;right<s.length();right++){

            char c = s.charAt(right);
            while(st.contains(c)){
                st.remove(s.charAt(left));
                left++;
            }
            st.add(c);
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}
