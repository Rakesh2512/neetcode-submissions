class Solution {
    public String minWindow(String s, String t) {
        
        Map<Character,Integer>mp1 = new HashMap<>();
        for(char ch : t.toCharArray()){
            mp1.put(ch,mp1.getOrDefault(ch,0)+1);
        }

        // enquire the substring

        int mct = 0;
        int dmct = t.length();
        int i = -1;
        int j = -1;
        String ans = "";

        Map<Character,Integer>mp2 = new HashMap<>();

        while(true){
            boolean first = false;
            boolean second = false;

            while(i<s.length()-1 && mct < dmct){
                i++;
                char c = s.charAt(i);
                mp2.put(c,mp2.getOrDefault(c,0)+1);

                if(mp2.getOrDefault(c,0) <= mp1.getOrDefault(c,0)){
                    mct++;
                }

                first = true;
            }

            while(j<i && mct == dmct){
                String subs = s.substring(j+1,i+1);
                if(ans.length() == 0 || subs.length() < ans.length()){
                    ans = subs;
                }

                j++;
                char c = s.charAt(j);
                if(mp2.get(c) == 1){
                    mp2.remove(c);
                }
                else{
                    mp2.put(c,mp2.get(c)-1);
                }

                if(mp2.getOrDefault(c,0) < mp1.getOrDefault(c,0)){
                    mct--;
                }
                second = true;
            }
            if(!first || !second){
                break;
            }
        }

        return ans;
        
    }
}
