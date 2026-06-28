class Solution {
    public int jump(int[] nums) {
        
        int n = nums.length;
        int currIndex = nums[0];
        int maxReach = nums[0];
        int jump = 1;

        if(n <= 1){
            return 0;
        }

        for(int i =1;i<n;i++){

            if(i > maxReach){
                return -1;
            }

            if(i > currIndex){
                jump++;
                currIndex = maxReach;
            }

            maxReach = Math.max(maxReach , i+nums[i]);
        }
        return jump;
    }
}
