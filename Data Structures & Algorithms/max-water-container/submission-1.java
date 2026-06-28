class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int l = 0;
        int r = n-1;

        int max_water = 0;

        while(l<r){
            int water = Math.abs(r-l) * Math.min(height[l],height[r]);
            max_water = Math.max(max_water,water);

            if(height[l] <= height[r]){
               l++;
            }
            else{
                r--;
            }
        }
        return max_water;
    }
}
