class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        int n = nums.length;

        Map<Integer,Integer>mp = new HashMap<>();

        for(Integer it : nums){
            mp.put(it,mp.getOrDefault(it,0)+1);
        }
        
        for(Integer i : mp.values()){
            if(i > 1){
                return true;
            }
        }
        return false;
    }
}