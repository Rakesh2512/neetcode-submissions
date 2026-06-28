class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;

        Map<Integer,Integer>mp = new HashMap<>();

        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        for(int it: mp.values()){
            if(it > 1){
                return true;
            }
        }
        return false;
    }
}