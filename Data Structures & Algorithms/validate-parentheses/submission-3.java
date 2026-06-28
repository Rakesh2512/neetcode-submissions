class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n == 0 || s == null){
            return true;
        }
        Stack<Character>st = new Stack<>();

        for(int i = 0;i<n;i++){
            if(s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{'){
                st.add(s.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else{
                    char c = st.peek();
                    st.pop();
                    if(c != '[' && s.charAt(i) == ']'){
                        return false;
                    }
                    if(c != '{' && s.charAt(i) == '}'){
                        return false;
                    }
                    if(c != '(' && s.charAt(i) == ')'){
                        return false;
                    }
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
