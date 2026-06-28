class Solution {

    public boolean check(String s,Set<String>st,int index,Boolean visit[]){
        if(index == s.length()){
           return true;
        }
        if(visit[index] != null){
            return visit[index];
        }

        for(int i = index+1;i<=s.length();i++){
            String sub = s.substring(index,i);
            if(st.contains(sub) && check(s,st,i,visit)){
                return visit[index] = true;
            }
        }
        return visit[index] = false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String>st = new HashSet<>(wordDict);
        Boolean[] visit = new Boolean[s.length()];

        return check(s,st,0,visit);
    }
}
