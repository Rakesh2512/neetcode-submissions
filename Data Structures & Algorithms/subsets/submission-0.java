class Solution {
    public void solve(int[] nums,int index,List<Integer>a,List<List<Integer>>ans){
        
        ans.add(new ArrayList<>(a));
        for(int i = index;i<nums.length;i++){
            a.add(nums[i]);
            solve(nums,i+1,a,ans);
            a.remove(a.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();

        solve(nums,0,new ArrayList<>(),ans);
        return ans;
    }
}
