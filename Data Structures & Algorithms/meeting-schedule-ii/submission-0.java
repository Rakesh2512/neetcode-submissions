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
    public int minMeetingRooms(List<Interval> intervals) {

        int[] startInterval = new int[intervals.size()];
        int[] endInterval = new int[intervals.size()];

        for(int i=0;i<intervals.size();i++){
            startInterval[i] = intervals.get(i).start;
            endInterval[i] = intervals.get(i).end;
        }

        Arrays.sort(startInterval);
        Arrays.sort(endInterval);

        int endptr =0 ;
        int count = 0;

        for(int i =0;i<intervals.size();i++){

            if(startInterval[i] < endInterval[endptr]){
                count++;
            }
            else{
                endptr++;
            }
        }
        return count;
    }
}
