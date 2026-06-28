class Solution {
    public boolean isValid(String s) {
        
        Stack<Character>st = new Stack<>();

        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{'){
                st.add(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else{
                    char ch = st.pop();
                    if(ch == '[' && c == ']'){
                        continue;
                    }
                    else if(ch == '(' && c == ')'){
                        continue;
                    }
                    else if(ch == '{' && c == '}'){
                        continue;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}
