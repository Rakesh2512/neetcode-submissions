class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>ans = new ArrayList<>();
        if(strs == null || strs.length == 0){
            return ans;
        }

        Map<String,List<String>>mp = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String word = strs[i];
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String w = new String(c);
            if(!mp.containsKey(w)){
                mp.put(w,new ArrayList<>());
            }
            mp.get(w).add(word);
        }
        return new ArrayList<>(mp.values());
    }
}
