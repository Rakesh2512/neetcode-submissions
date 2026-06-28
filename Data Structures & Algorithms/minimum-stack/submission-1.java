class MinStack {

    Stack<Integer>st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        st.add(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        Stack<Integer>temp = new Stack<>();
        int minValue = Integer.MAX_VALUE;
        while(!st.isEmpty()){
            int val = st.pop();
            minValue = Math.min(minValue,val);
            temp.add(val);
        }
        while(!temp.isEmpty()){
            st.add(temp.pop());
        }
        return minValue;
    }
}
