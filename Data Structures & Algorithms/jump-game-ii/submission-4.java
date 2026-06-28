class Solution {
    public int jump(int[] nums) {
        
        int currIndex = 0;
        int jump = 0;
        int maxjump = 0;

        for(int i=0;i<nums.length-1;i++){
            maxjump = Math.max(maxjump,nums[i]+i);

            if(i == currIndex){
                jump++;
                currIndex = maxjump;
            }
        }

        return jump;
    }
}
