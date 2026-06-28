class Solution {
    public void sortColors(int[] nums) {
        
        int n = nums.length;
        int l = 0;
        int mid = 0;
        int r = n-1;

        while(mid<=r){
           if(nums[mid] == 0){
              int temp = nums[l];
              nums[l] = nums[mid];
              nums[mid] = temp;
              l++;
              mid++;
           }
           else if(nums[mid] == 1){
              mid++;
           }
           else{
               int temp = nums[mid];
               nums[mid] = nums[r];
               nums[r] = temp;
               r--;
           }
        }
    }
}