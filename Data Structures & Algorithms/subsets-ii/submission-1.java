class Solution {

    Set<List<Integer>>st = new HashSet<>();

    public void solve(int[] nums,int index,List<Integer>a,List<List<Integer>>ans){
        
        ans.add(new ArrayList<>(a));

        for(int i = index;i<nums.length;i++){
            if(i>index && nums[i] == nums[i-1]){
                continue;
            }
            a.add(nums[i]);
            solve(nums,i+1,a,ans);
            a.remove(a.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums,0,new ArrayList<>(),ans);
        return ans;
    }
}
