class Solution {
    public boolean isPalindrome(String s) {
        String k="";
        char[]c=s.toCharArray();
        for(char ch:c){
            if(Character.isLetterOrDigit(ch)){
                k+=ch;
            }
        }
        k=k.toLowerCase();
        int i=0,j=k.length()-1;
        while(i<j){
           if(k.charAt(i)!=k.charAt(j)) return false;
           i++;
           j--;
        }
        return true;
    }
}
