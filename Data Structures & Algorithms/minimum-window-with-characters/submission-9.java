class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer>mp1 = new HashMap<>();

        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            mp1.put(c,mp1.getOrDefault(c,0)+1);
        }

        int mct = 0;
        int dmct = t.length();
        String ans = "";

        Map<Character,Integer>mp2 = new HashMap<>();

        int i = -1;
        int j = -1;

        while(true){

            boolean flag1 = false;
            boolean flag2 = false;

            while(i<s.length()-1 && mct < dmct){
                i++;
                char c = s.charAt(i);
                mp2.put(c,mp2.getOrDefault(c,0)+1);

                if(mp2.getOrDefault(c,0) <= mp1.getOrDefault(c,0)){
                    mct++;
                }
                flag1 = true;
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

                flag2 = true;
            }
            if(flag1 == false || flag2 == false){
                break;
            }
        }
        return ans;
    }
}
