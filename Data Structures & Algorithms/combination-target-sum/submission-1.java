class Solution {

    public void solve(int index,int[] nums,int target,List<List<Integer>>ans,List<Integer>temp){
        if(target < 0){
            return;
        }
        else if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        else{
            for(int i =index;i<nums.length;i++){
                temp.add(nums[i]);
                solve(i,nums,target-nums[i],ans,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>ans = new ArrayList<>();
        if(nums.length == 0){
            return ans;
        }

        solve(0,nums,target,ans,new ArrayList<>());
        return ans;
    }
}
