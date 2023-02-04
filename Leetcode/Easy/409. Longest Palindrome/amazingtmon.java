class Solution {
    public int longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();

        if(s.length() == 1) return 1;

        int count = 0;
        for(char c : chars){
            if(set.contains(c)){
                set.remove(c);
                count ++;
            } else {
                set.add(c);
            }
        }

        if(count*2 < s.length()) return (count*2)+1;
        if(count*2 == s.length()) return count*2;

        return 0;
    }
}