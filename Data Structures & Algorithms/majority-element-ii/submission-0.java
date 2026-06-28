class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer>ans  = new ArrayList<>();

        int n = nums.length;

        Map<Integer,Integer>mp = new HashMap<>();

        for(int i=0;i<n;i++){
            mp.put(nums[i] , mp.getOrDefault(nums[i] , 0)+1);
        }

        int l = n/3;

        for(Map.Entry<Integer,Integer> it : mp.entrySet()){
            if(it.getValue() > l){
                ans.add(it.getKey());
            }
        }
        return ans;
    }
}