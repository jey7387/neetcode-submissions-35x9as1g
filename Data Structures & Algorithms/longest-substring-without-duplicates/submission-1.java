class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=Integer.MIN_VALUE;
        if(s.isEmpty()) return 0;
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<n;j++){
                if(sb.indexOf(String.valueOf(s.charAt(j)))==-1){
                    sb.append(s.charAt(j));
                    int len=sb.length();
                    max=Math.max(len,max);
                }
                else break;
                
            }
        }
        return max;
    }
}
