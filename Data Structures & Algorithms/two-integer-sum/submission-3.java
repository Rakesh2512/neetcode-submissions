class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = {-1,-1};

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int sum = nums[i] + nums[j];
                if(sum == target){
                    return new int[] {i,j};
                }
            }
        }
        return ans;
    }
}
