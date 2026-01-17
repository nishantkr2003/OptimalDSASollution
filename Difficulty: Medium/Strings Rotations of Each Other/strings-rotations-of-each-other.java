class Solution {
    public boolean areRotations(String s1, String s2) {
        
        if (s1 == null || s2 == null) return false;
        if (s1.length() != s2.length()) return false;
        if (s1.length() == 0) return true;

        String s = s1 + s1;
        //return s.contains(s2);
        return s.lastIndexOf(s2) >= 0;
    }
}
