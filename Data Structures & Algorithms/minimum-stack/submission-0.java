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
        int min = Integer.MAX_VALUE;
        while(!st.isEmpty()){
            min = Math.min(min,st.peek());
            temp.add(st.pop());
        }

        while(!temp.isEmpty()){
            st.add(temp.pop());
        }
        return min;
    }
}
