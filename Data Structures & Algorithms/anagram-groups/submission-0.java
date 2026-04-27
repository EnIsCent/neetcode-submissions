class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapOfAnagrams = new HashMap();

        for(int i = 0 ; i < strs.length ; i++ ) {
            String temp = Stream.of(strs[i].split(""))
                            .sorted()
                            .collect(Collectors.joining());

            if(mapOfAnagrams.containsKey(temp)){
                List<String> tempList = mapOfAnagrams.get(temp);
                tempList.add(strs[i]);
                mapOfAnagrams.put(temp, tempList);
            } else {
                List<String> tempList = new ArrayList();
                tempList.add(strs[i]);
                mapOfAnagrams.put(temp, tempList);
            }
        }
        return new ArrayList(mapOfAnagrams.values());
    }
}
