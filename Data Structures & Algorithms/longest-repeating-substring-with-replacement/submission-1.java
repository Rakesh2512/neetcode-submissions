class Solution {
    public int characterReplacement(String s, int k) {
        
        int maxLength = 0;
        int maxCount = 0;
        int left = 0;

        Map<Character,Integer>mp = new HashMap<>();

        for(int right=0;right<s.length();right++){
            mp.put(s.charAt(right),mp.getOrDefault(s.charAt(right),0)+1);
            maxCount = Math.max(mp.get(s.charAt(right)),maxCount);
            while((right-left+1) - maxCount > k){
                char ch = s.charAt(left);
                mp.put(ch,mp.get(ch)-1);
                left++;
            }
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}