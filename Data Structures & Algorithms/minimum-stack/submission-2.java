class MinStack {

    Stack<Integer>st1;
    Stack<Integer>st2;
    
    public MinStack() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int val) {
        st1.add(val);
    }
    
    public void pop() {
        st1.pop();
    }
    
    public int top() {
        int value = st1.peek();
        return value;
    }
    
    public int getMin() {

        int minValue = Integer.MAX_VALUE;
        while(!st1.isEmpty()){
            int value = st1.pop();
            minValue = Math.min(minValue,value);
            st2.add(value);
        }

        while(!st2.isEmpty()){
            int value = st2.pop();
            st1.add(value);
        }
        return minValue;
    }
}
