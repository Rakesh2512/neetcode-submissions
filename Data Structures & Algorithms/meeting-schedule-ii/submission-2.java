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

        int n = intervals.size();

        int[] startptr = new int[n];
        int[] endptr = new int[n];

        for(int i=0;i<n;i++){
            startptr[i] = intervals.get(i).start;
            endptr[i] = intervals.get(i).end;
        }
        Arrays.sort(startptr);
        Arrays.sort(endptr);
        int count  = 0 ;

        int end = 0;
        for(int i=0;i<n;i++){
            if(startptr[i] < endptr[end]){
                count++;
            }
            else{
                end++;
            }
        }
        return count;
    }    
}
