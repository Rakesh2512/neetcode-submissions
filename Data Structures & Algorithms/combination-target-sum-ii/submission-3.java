class Solution {

    public void solve(int index,int[] candidates,int target,List<List<Integer>>ans,List<Integer>temp){
        if(target < 0){
            return ;
        }
        else if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        else{
            for(int i=index;i<candidates.length;i++){
                if(i > index && candidates[i] == candidates[i-1]){
                    continue;
                }
                temp.add(candidates[i]);
                solve(i+1,candidates,target-candidates[i],ans,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>>ans = new ArrayList<>();

        if(candidates.length == 0){
            return ans;
        }

        solve(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}
