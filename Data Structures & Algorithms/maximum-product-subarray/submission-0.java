class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];

        for(int i = 0;i<nums.length;i++){
            int curr = nums[i];
            maxProduct = Math.max(maxProduct ,curr);

            for(int j = i+1;j <nums.length;j++){
                curr = curr*nums[j];
                maxProduct = Math.max(maxProduct,curr);
            }
        }
        return maxProduct;
    }
}
