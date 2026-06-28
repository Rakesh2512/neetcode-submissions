class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String , List<String>> mp = new HashMap<>();

        
        for(String word : strs){
            String sortedWord = word;
            char[] c = sortedWord.toCharArray();
            Arrays.sort(c);
            String sortWord = new String(c);

            if(!mp.containsKey(sortWord)){
                mp.put(sortWord,new ArrayList<>());
            }
            mp.get(sortWord).add(word);
        }
        return new ArrayList<>(mp.values());
    }
}
