class Solution {
    public boolean isPalindrome(String s) {
        String reversed="";
        for(int i=s.length();i>=0;i++)
        {
            reversed=reversed+s.charAt(i);
        }
        if(reversed.equals(s))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}