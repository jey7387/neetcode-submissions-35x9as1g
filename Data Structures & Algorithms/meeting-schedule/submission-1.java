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
    public boolean canAttendMeetings(List<Interval> in) {
        Collections.sort(in,(a,b)->Integer.compare(a.start,b.start));
        int n=in.size();
        int i=0;
        while(i<n-1){
            if(in.get(i).end>in.get(i+1).start) return false;
            i++;
        }
        return true;
    }
}
