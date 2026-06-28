class Solution {

    public boolean solve(int[] nums,int index,int target){

        if(target == 0){
            return true;
        }
        if(index == 0){
            return target == nums[0];
        }

        boolean notPick = solve(nums,index-1,target);
        boolean pick = false;
        if(target-nums[index] >= 0){
            pick = solve(nums,index-1,target-nums[index]);
        }

        return pick || notPick;

    }
    public boolean canPartition(int[] nums) {
        
        int n = nums.length;

        int sum = 0;
        for(int i =0;i<n;i++){
            sum+= nums[i];
        }

        if(sum % 2 != 0){
            return false;
        }

        int target = sum/2;
        boolean ans = solve(nums,n-1,target);
        return ans == true ? true :false;
    }
}
