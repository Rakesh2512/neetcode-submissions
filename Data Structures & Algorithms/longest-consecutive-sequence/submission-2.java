class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if(n == 0){
            return 0;
        }
        Arrays.sort(nums);
        
        int ans = 1;
        int count = 1;

        for(int i=1;i<n;i++){
            if(nums[i-1] == nums[i]){
                continue;
                
            }
            if(nums[i] == nums[i-1]+1){
                count++;
            }
            else{
                ans = Math.max(ans,count);
                count = 1;
            }
        }
        return Math.max(ans,count);
    }
}
