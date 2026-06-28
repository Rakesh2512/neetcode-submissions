class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer>st = new Stack<>();
        for(int ast : asteroids){
            if(ast > 0){
                st.add(ast);
            }
            else{
                while(!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(ast)){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek() == Math.abs(ast)){
                    st.pop();
                }
                else if(st.isEmpty() || st.peek() < 0){
                    st.add(ast);
                }
            }
        }
        List<Integer>ans = new ArrayList<>();
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        Collections.reverse(ans);
        int size = ans.size();
        int[] result = new int[size];
        for(int i=0;i<ans.size();i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}