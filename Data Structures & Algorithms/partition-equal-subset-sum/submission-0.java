class Solution {
    public boolean solve(int[] nums,int index,int target){
        if(target == 0){
            return true;
        }
        if(index == 0){
            return target == nums[0];
        }

        boolean pick = solve(nums,index-1,target);
        boolean notPick = solve(nums,index-1,target-nums[index]);

        return pick || notPick;
    }
    public boolean canPartition(int[] nums) {
        
        int n = nums.length;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum += nums[i];
        }

        if(sum % 2 != 0){
            return false;
        }

        int half = sum /2;

        return solve(nums,n-1,half);
    }
}
