class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        

        int n = nums.length;
        Arrays.sort(nums);

        Set<List<Integer>>st = new HashSet<>();

        List<List<Integer>>ans = new ArrayList<>();

        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k =j+1;k<n;k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0){

                        if(!st.contains(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])))){
                            ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                            st.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                        }
                        
                    }
                }
            }
        }
        return ans;
    }
}
