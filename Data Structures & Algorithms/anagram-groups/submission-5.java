class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        int n = strs.length;
        List<List<String>>ans = new ArrayList<>();

        if(n == 0 || strs == null){
            return ans;
        }

        Map<String,List<String>>mp = new HashMap<>();

        for(String word : strs){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if(!mp.containsKey(s)){
                mp.put(s,new ArrayList<>());
            }
            mp.get(s).add(word);
        }
        return new ArrayList<>(mp.values());
    }
}
