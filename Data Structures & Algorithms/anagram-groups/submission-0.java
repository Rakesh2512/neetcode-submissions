class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>>mp = new HashMap<>();

        for(String word : strs){
            char[] s = word.toCharArray();
            Arrays.sort(s);
            String sortedword = new String(s);

            if(!mp.containsKey(sortedword)){
                mp.put(sortedword,new ArrayList<>());
            }
            mp.get(sortedword).add(word);
        }

        return new ArrayList<>(mp.values());
    }
}
