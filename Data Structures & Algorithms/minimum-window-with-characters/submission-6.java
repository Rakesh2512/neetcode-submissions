class Solution {
    public String minWindow(String s, String t) {
        
        Map<Character,Integer>map1 = new HashMap<>();
        for(int i =0;i<t.length();i++){
            char c = t.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1);
        }

        int i = -1;
        int j = -1;
        int mct = 0;
        int dmct = t.length();
        String ans = "";

        Map<Character,Integer>map2 = new HashMap<>();

        while(true){
            boolean flag1 = false;
            boolean flag2 = false;

            while(i<s.length()-1 && mct < dmct){
                i++;
                char c = s.charAt(i);
                map2.put(c,map2.getOrDefault(c,0)+1);
                if(map2.getOrDefault(c,0) <= map1.getOrDefault(c,0)){
                    mct++;
                }

                flag1 = true;
            }
            while(j < i && mct == dmct){
                String pans = s.substring(j+1,i+1);
                if(ans.length() == 0 || ans.length() > pans.length()){
                    ans = pans;
                }
                j++;
                char c = s.charAt(j);
                if(map2.get(c) == 1){
                    map2.remove(c);
                }
                else{
                    map2.put(c,map2.get(c)-1);
                }
                if(map2.getOrDefault(c,0) < map1.getOrDefault(c,0)){
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
