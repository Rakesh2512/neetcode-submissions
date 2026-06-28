class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            sum = 0;
            for(int j=i;j<nums.length;j++){
                sum+= nums[j];

                if(sum >= target){
                   ans = Math.min(ans,j-i+1);
                   break;
                }
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}