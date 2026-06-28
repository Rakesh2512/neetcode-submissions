class Solution {
    public int characterReplacement(String s, int k) {
        
        int left = 0;
        int maxLength = 0;
        int maxCount = 0;
        Map<Character,Integer>mp = new HashMap<>();

        for(int right = 0;right<s.length();right++){
            char c = s.charAt(right);
            mp.put(c,mp.getOrDefault(c,0)+1);
            maxCount = Math.max(maxCount,mp.get(c));
            while((right - left + 1) - maxCount > k){
                char ch = s.charAt(left);
                mp.put(ch,mp.get(ch)-1);
                left++;
            }
            maxLength = Math.max(maxLength,right - left + 1);
        }
        return maxLength;
    }
}
