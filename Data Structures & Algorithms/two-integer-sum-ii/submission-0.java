class Solution {
    public int[] twoSum(int[] numbers, int target) {

        Map<Integer,Integer>mp = new HashMap<>();

        int[] ans = new int[2];

        for(int i =0;i<numbers.length;i++){
            if(mp.containsKey(target - numbers[i])){

                ans[0] = mp.get(target-numbers[i])+1;
                ans[1] = i+1;
            }
            else{
                mp.put(numbers[i],i);
            }
        }
        return ans;
    }
}
