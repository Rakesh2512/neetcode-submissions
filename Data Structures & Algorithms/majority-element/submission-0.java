class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;

        Map<Integer,Integer>mp = new HashMap<>();

        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> it : mp.entrySet()){
            if(it.getValue() > n/2){
                return it.getKey();
            }
        }
        return -1;
    }
}