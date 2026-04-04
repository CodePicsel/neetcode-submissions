class Solution {
    public boolean isPalindrome(String s) {
        String sTrimed = s.replaceAll("\\s+", "");
        String sCleaned = sTrimed.replaceAll("[^a-zA-Z0-9]", "");
        sCleaned = sCleaned.toLowerCase();
        int l=0, r=sCleaned.length()-1;
        while(l<r){
            if(sCleaned.charAt(l)!=sCleaned.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
