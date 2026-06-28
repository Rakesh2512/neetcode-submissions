class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer>mp = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Integer>pq = new PriorityQueue<Integer>((a,b)-> mp.get(b)-mp.get(a));

        for(Map.Entry<Integer,Integer>it : mp.entrySet()){
            pq.offer(it.getKey());
        }
        int index = 0;
        int[] ans = new int[k];
        while(k > 0){
            ans[index++] = pq.poll();
            k--;
        }
        return ans;
    }
}
