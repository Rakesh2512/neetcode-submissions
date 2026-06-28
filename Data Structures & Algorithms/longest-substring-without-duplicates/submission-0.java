class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();

        int count = 1;

        int left = 0;

        int length = 0;
        Set<Character>st = new HashSet<>();

        for(int right = 0;right<n;right++){
            while(st.contains(s.charAt(right))){
                st.remove(s.charAt(left));
                left++;
            }
            st.add(s.charAt(right));
            length = Math.max(length,right-left+1);
        }
        return length;
    }
}
