class Solution {
    public void solve(int[] candidates,int index,int target,List<Integer>a,List<List<Integer>>ans){
        if(target < 0){
            return;
        }
        else if(target == 0){
            ans.add(new ArrayList<>(a));
        }
        else{
            for(int i =index;i<candidates.length;i++){
                if(i > index && candidates[i] == candidates[i-1]){
                    continue;
                }
                a.add(candidates[i]);
                solve(candidates,i+1,target-candidates[i],a,ans);
                a.remove(a.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>ans = new ArrayList<>();

        solve(candidates,0,target,new ArrayList<>(),ans);

        return ans;
    }
}
