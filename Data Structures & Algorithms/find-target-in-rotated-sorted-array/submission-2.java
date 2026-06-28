class Solution {
    public int search(int[] nums, int key) {

        int l = 0;
        int r = nums.length-1;

        while(l<=r){

            int mid = l+(r-l)/2;

            if(nums[mid] == key){
                return mid;
            }
            else if(nums[l] <= nums[mid]){

                if(key>= nums[l] && key < nums[mid]){
                    r = mid-1;
                }
                else{
                    l = mid+1;
                }
            }
            else{
                if(key > nums[mid] && key <= nums[r]){
                    l = mid+1;
                }
                else{
                    r = mid-1;
                }
            }
        }
        return -1;
    }
}
