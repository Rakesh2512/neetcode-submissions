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
    public boolean canAttendMeetings(List<Interval> intervals) {

        int n = intervals.size();

        if(n == 0){
            return true;
        }

        Collections.sort(intervals,(l1,l2) -> l1.start - l2.start);

        int end = intervals.get(0).end;
        for(int i=1;i<n;i++){
            if(end > intervals.get(i).start){
                return false;
            }
            else{
                end = intervals.get(i).end;
            }
            
        }

        return true;
    }
}
