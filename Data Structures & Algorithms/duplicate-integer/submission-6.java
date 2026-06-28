class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        int n = nums.length;

        Map<Integer,Integer>mp = new HashMap<>();

        for(Integer it : nums){
            mp.put(it,mp.getOrDefault(it,0)+1);
        }
        
        for(Map.Entry<Integer,Integer>it : mp.entrySet()){
            if(it.getValue() > 1){
                return true;
            }
        }
        return false;
    }
}