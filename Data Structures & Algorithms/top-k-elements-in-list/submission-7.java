class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer>freq = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b) -> freq.get(b) - freq.get(a));

        for(Map.Entry<Integer,Integer> it : freq.entrySet()){
            pq.offer(it.getKey());
        }

        int[] ans = new int[k];
        int index = 0;

        while(k > 0){
            ans[index++] = pq.poll();
            k--;
        }
        return ans;
    }
}
