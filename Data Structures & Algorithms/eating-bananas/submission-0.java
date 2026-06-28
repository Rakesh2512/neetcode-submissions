class Solution {
    public int max(int[] p){

        int max = Integer.MIN_VALUE;

        for(int i=0;i<p.length;i++){
            max = Math.max(max,p[i]);
        }
        return max;

    }
    public int minEatingSpeed(int[] piles, int h) {
        
        int l =0;
        int r = max(piles);

        int ans = 0;

        while(l<=r){
            int mid = l+(r-l)/2;
            long totalTime = 0;
            for(int p : piles){
                totalTime+= Math.ceil((double)p/mid);
            }
            if(totalTime <= h){
                ans = mid;
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
}
