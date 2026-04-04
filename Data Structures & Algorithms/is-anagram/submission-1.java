class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        Arrays.sort(arrS);
        Arrays.sort(arrT);
        String sSorted = new String(arrS);
        String tSorted = new String(arrT);
        if(sSorted.equals(tSorted))return true;
        return false;
    }
}
