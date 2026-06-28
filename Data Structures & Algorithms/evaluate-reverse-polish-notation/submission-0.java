class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st = new Stack<>();

        for(String s : tokens){

            if(Character.isDigit(s.charAt(0)) || 
               (s.length() > 1 && s.charAt(0) == '-')){
                st.add(Integer.parseInt(s));
            }
            else{
                int a = st.pop();
                int b = st.pop();
                
                if(s.equals("+")){
                    st.add(a+b);
                }
                else if(s.equals("-")){
                    st.add(b-a);
                }
                else if(s.equals("*")){
                    st.add(a*b);
                }
                else{
                    st.add(b/a);
                }
            }
        }
        return st.pop();
    }
}
