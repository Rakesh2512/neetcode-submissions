class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        int n = nums.length;

        PriorityQueue<Integer>pq = new PriorityQueue<>( (a,b) -> b-a);

        for(int it : nums){
            pq.add(it);
        }
        k--;
        while(k-- > 0){
            pq.poll();
        }

        return pq.peek();
    }
}
