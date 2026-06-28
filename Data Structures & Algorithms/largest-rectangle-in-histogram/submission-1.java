class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int n = heights.length;
        Stack<int[]>st = new Stack<>();
        int maxArea = 0;

        for(int i =0;i<n;i++){
            int start = i;
            while(!st.isEmpty() && st.peek()[1] > heights[i]){
                int[] top = st.pop();
                int height = top[1];
                int index = top[0];
                start = index;
                maxArea = Math.max(maxArea,height*(i-index));
            }
            st.push(new int[] {start,heights[i]});
        }

        for(int[] p : st){
            int index = p[0];
            int h = p[1];
            maxArea = Math.max(maxArea,h*(heights.length-index));
        }
        return maxArea;
    }
}
