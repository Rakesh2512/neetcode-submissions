class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int[] ans = new int[temperatures.length];

        int n = temperatures.length;
        Stack<Integer>st = new Stack<>();

        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
                int gap = st.pop();
                ans[gap] = i - gap;
            }
            st.add(i);
        }
        return ans;
    }
}
