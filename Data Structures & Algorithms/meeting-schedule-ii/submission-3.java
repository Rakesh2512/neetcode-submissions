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
        
        int[] st = new int[n];
        int[] en = new int[n];

        for(int i=0;i<n;i++){
            st[i] = intervals.get(i).start;
            en[i] = intervals.get(i).end;
        }

        Arrays.sort(st);
        Arrays.sort(en);

        int rooms = 0;
        int e = 0;
        for(int i=0;i<n;i++){
            if(st[i] < en[e]){
                rooms++;
            }
            else{
                e++;
            }
        }
        return rooms;
    }
}
