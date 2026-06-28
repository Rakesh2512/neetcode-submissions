class Solution {

    public int solve(int[] nums,int index,int total,int target){
        if(index == nums.length){
            return total == target ? 1 : 0;
        }

        int first =  solve(nums,index+1,total+nums[index],target);
        int second = solve(nums,index+1,total-nums[index],target);

        return first + second;

    }
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums,0,0,target);
    }
}
