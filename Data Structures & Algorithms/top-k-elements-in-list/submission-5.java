class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer>mp = new HashMap<>();

        for(int it : nums){
            mp.put(it,mp.getOrDefault(it,0)+1);
        }

        PriorityQueue<Integer>pq = new PriorityQueue<Integer>((a,b) -> mp.get(b) - mp.get(a));


        for(Map.Entry<Integer,Integer>it : mp.entrySet()){
            pq.offer(it.getKey());
        }

        int[] ans = new int[k];
        int index = 0;

        while(k-- > 0){
            ans[index++] = pq.poll();
        }
        return ans;
    }
}
