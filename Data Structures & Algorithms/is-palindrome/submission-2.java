class Solution {
    public boolean isPalindrome(String s) {
        int l=0, r=s.length()-1;
        while(l<r){
            char leftMost = s.charAt(l);
            char rightMost = s.charAt(r);
            if(Character.isWhitespace(leftMost)) {l++;continue;}
            if(!Character.isLetterOrDigit(leftMost)) {l++;continue;}
            if(Character.isWhitespace(rightMost)) {r--;continue;}
            if(!Character.isLetterOrDigit(rightMost)) {r--;continue;}
            if(Character.toLowerCase(leftMost)==Character.toLowerCase(rightMost))
            {
                l++;
                r--;
            }else{
                return false;
            }
        }
        return true;
    }
}
