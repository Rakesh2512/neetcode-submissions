class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int n = heights.length;
        Stack<int[]>st = new Stack<>();
        int maxArea = 0;

        for(int i=0;i<n;i++){
            int start = i;
            while(!st.isEmpty() && st.peek()[1] > heights[i]){
                int[] top = st.pop();
                int index = top[0];
                int height = top[1];

                start = index;
                maxArea = Math.max(maxArea,height*(i-index));
            }
            st.add(new int[]{start,heights[i]});
        }
        for(int[] p : st){
            int index = p[0];
            int h = p[1];
            maxArea = Math.max(maxArea,h*(n-index));
        }
        return maxArea;
    }
}
