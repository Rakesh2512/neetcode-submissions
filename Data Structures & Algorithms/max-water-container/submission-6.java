class Solution {
    public int maxArea(int[] heights) {
        
        int l = 0;
        int r = heights.length-1;

        int water = Integer.MIN_VALUE;

        while(l<r){
            int contains = Math.abs(r-l)*Math.min(heights[l],heights[r]);
            water = Math.max(contains,water);

            if(heights[l] < heights[r]){
                l= l+1;
            }
            else{
                r = r-1;
            }
        }
        return water;
    }
}
