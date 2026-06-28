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
        int[][] interval = new int[n][2];

        for(int i=0;i<n;i++){
            interval[i][0] = intervals.get(i).start;
            interval[i][1] = intervals.get(i).end;
        }

        Arrays.sort(interval,(a,b) -> a[0] - b[0]);

        for(int i=0;i<n-1;i++){
            if(interval[i][1] > interval[i+1][0]){
                return false;
            }
        }

        return true;
    }
}
