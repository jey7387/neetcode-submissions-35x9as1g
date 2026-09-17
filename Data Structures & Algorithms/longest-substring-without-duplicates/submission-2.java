class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        int j=0;
        int max=0;
        while(i<n && j<n){
           if(!map.containsKey(s.charAt(j))){
               map.put(s.charAt(j),j);
           }
           else{
              if(i<=map.get(s.charAt(j))){
                i=map.get(s.charAt(j))+1;}
                map.put(s.charAt(j),j);
                
              }
              
           int len=j-i+1;
           max=Math.max(len,max);
           j++;
        }
        return max;
    }
}
