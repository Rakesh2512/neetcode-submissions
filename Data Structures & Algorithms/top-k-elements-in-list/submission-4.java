class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int n = nums.length;


        Map<Integer,Integer>mp = new HashMap<>();
        for(Integer it : nums){
            mp.put(it,mp.getOrDefault(it,0)+1);
        }

        List<Integer>ans = new ArrayList<>();
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b) -> mp.get(b) - mp.get(a));

        for(Integer i : mp.keySet()){
            pq.offer(i);
        }

        while(k > 0){
            ans.add(pq.poll());
            k--;
        }

        Collections.reverse(ans);

        int size = ans.size();
        int[] result = new int[size];

        for(int i=0;i<size;i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}
