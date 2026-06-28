class Solution {

    public boolean solve(int index,int[] nums,int target){
        if(target == 0){
            return true;
        }

        if(index == nums.length-1){
            return target == nums[index];
        }

        boolean Notpick = solve(index+1,nums,target);
        boolean pick = false;
        if(target - nums[index] >= 0){
            pick = solve(index+1,nums,target - nums[index]);
        } 

        return Notpick||pick;
    }
    public boolean canPartition(int[] nums) {
        
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        if(sum%2 !=0){
            return false;
        }

        int target = sum/2;

        boolean ans = solve(0,nums,target);
        return ans;
    }
}
