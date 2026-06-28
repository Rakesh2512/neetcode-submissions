class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int n = nums.length;

        Map<Integer,Integer>mp = new HashMap<>();

        for(int it : nums){
            mp.put(it,mp.getOrDefault(it,0)+1);
        }

        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b) -> mp.get(b) - mp.get(a));

        for(int it : mp.keySet()){
            pq.add(it);
        }

        int[] ans = new int[k];
        int index = 0;

        while(k-->0){
            ans[index++] = pq.poll();
        }
        return ans;

    }
}
