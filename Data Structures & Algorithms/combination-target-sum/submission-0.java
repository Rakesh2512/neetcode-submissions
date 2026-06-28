class Solution {

    public void solve(int[] nums,int index,int target,List<Integer>a , List<List<Integer>>ans){
        if(target < 0){
            return;
        }
        else if(target == 0){
            ans.add(new ArrayList<>(a));
            
        }
        else{
            for(int i = index;i<nums.length;i++){
                a.add(nums[i]);
                solve(nums,i,target-nums[i],a,ans);
                a.remove(a.size()-1);
            }
        }

    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>ans = new ArrayList<>();
        solve(nums,0,target,new ArrayList<>(),ans);
        return ans;
    }
}
