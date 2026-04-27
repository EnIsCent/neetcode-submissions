class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapOfAnagrams = new HashMap();

        for(int i = 0 ; i < strs.length ; i++ ) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String tempString = new String(temp);

            if(!mapOfAnagrams.containsKey(tempString)){
                mapOfAnagrams.put(tempString, new ArrayList());
            } 
            mapOfAnagrams.get(tempString).add(strs[i]);
        }
        return new ArrayList(mapOfAnagrams.values());
    }
}
