class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];

        Stack<int[]>st = new Stack<>();
        for(int i =0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[i] > st.peek()[0]){
                int[] pair = st.pop();
                res[pair[1]] = i - pair[1];
            }
            st.add(new int[] {temperatures[i],i});
        }
        return res;
    }
}
