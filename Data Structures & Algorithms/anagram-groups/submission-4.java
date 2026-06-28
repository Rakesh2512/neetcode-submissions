class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>>group = new HashMap<>();

        for(String it : strs){
            char[] groupChar = it.toCharArray();
            Arrays.sort(groupChar);
            String word = new String(groupChar);

            if(!group.containsKey(word)){
                group.put(word,new ArrayList<>());
            }
            
            group.get(word).add(it);
        }
        return new ArrayList<>(group.values());
    }
}
