class Solution {
    public void solve(int[] nums,List<Integer>a,List<List<Integer>>ans){
        if(a.size() == nums.length){
            ans.add(new ArrayList<>(a));
            return;
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(a.contains(nums[i])){
                    continue;
                }
                a.add(nums[i]);
                solve(nums,a,ans);
                a.remove(a.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        solve(nums,new ArrayList<>(),ans);
        return ans;
    }
}
