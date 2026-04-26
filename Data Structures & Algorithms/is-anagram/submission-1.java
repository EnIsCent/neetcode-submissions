class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] charArrayA = new char[26];
        char[] charArrayB = new char[26];

        for(int i = 0 ; i < s.length() ; i++){
            int indexA = s.charAt(i) - 'a';
            int indexB = t.charAt(i) - 'a';
            charArrayA[indexA]++;
            charArrayB[indexB]++;
        }

        for(int i = 0 ; i < charArrayA.length ; i++){
            if(charArrayA[i] != charArrayB[i]){
                return false;
            }
        }

        return true;

    }
}
