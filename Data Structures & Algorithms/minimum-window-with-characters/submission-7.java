class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer>mp1 = new HashMap<>();

        for(char c : t.toCharArray()){
            mp1.put(c,mp1.getOrDefault(c,0)+1);
        }

        String ans  = "";
        int i = -1;
        int j = -1;
        int dmct = t.length();
        int mct = 0;
        Map<Character,Integer>mp2 = new HashMap<>();

        while(true){
            boolean f1 = false;
            boolean f2 = false;
            while(i<s.length()-1 && mct < dmct ){
                i++;
                char ch = s.charAt(i);
                mp2.put(ch,mp2.getOrDefault(ch,0)+1);
                if(mp2.getOrDefault(ch,0) <= mp1.getOrDefault(ch,0)){
                    mct++;
                }
                f1 = true;
            }
            while(j<i && mct == dmct){
                String subs = s.substring(j+1,i+1);
                if(ans.length() == 0 || ans.length() > subs.length()){
                    ans = subs;
                }
                j++;
                char ch = s.charAt(j);
                if(mp2.get(ch) == 1){
                    mp2.remove(ch);
                }
                else{
                    mp2.put(ch,mp2.get(ch)-1);
                }
                if(mp2.getOrDefault(ch,0) < mp1.getOrDefault(ch,0)){
                    mct--;
                }
                f2 = true;
            }
            if(f1 ==false || f2 == false){
                break;
            }
        }
        return ans;
    }
}
