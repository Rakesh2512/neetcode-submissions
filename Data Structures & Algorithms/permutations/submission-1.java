class Solution {
    List<List<Integer>>ans;
    public void swap(int[] nums,int l,int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
    public void solve(int index,int[] nums,List<Integer>temp){

        
        if(index == nums.length){
            List<Integer>a = new ArrayList<>();
            for(int i =0;i<nums.length;i++){
                a.add(nums[i]);
            }
            ans.add(a);
            return;
        }

        for(int i = index;i<nums.length;i++){

            swap(nums,index,i);
            solve(index+1,nums,temp);
            swap(nums,index,i);
        }

    }
    public List<List<Integer>> permute(int[] nums) {
       ans = new ArrayList<>();
        if(nums.length == 0){
            return ans;
        }
        
        solve(0,nums,new ArrayList<>());
        return ans;
    }
}
