class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>>mp = new HashMap<>();

        for(String it: strs){

            String word = it;
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            if(!mp.containsKey(s)){
                mp.put(s,new ArrayList<>());
            }
            mp.get(s).add(word);
        }
        return new ArrayList<>(mp.values());
    }
}
