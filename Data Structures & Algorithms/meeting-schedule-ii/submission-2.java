/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> in) {
      int c=0;
      int n=in.size();
      int i=0;
      int j=0;
      
      int s[]=new int[n];
      int e[]=new int[n];
       for(Interval x:in){
           s[i]=x.start;
           i++;
       }
       Arrays.sort(s);
       for(Interval x:in){
           e[j]=x.end;
           j++;
       }
       Arrays.sort(e);
       int max=0;
       i=0;j=0;
       while(i<n && j<n){
        if(s[i]<e[j] && i<n){
           c++;
           i++;
           max=Math.max(c,max);
        } 
        else if(j<n) {
            c--;
            j++; 
         }
    }
      return max;
}
}