class Solution {
    public int maxArea(int[] heights) {
        
        int l = 0;
        int r = heights.length-1;

        int contain = 0;

        while(l<r){
            int water = Math.abs(r-l) * Math.min(heights[l] , heights[r]);

            contain = Math.max(contain,water);
            if(heights[l] < heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return contain;
    }
}
