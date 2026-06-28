class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        ArrayList<int[]>ans = new ArrayList<>();
        //Arrays.sort(intervals,(a,b) -> a[0] - b[0]);

        int i = 0;

        while(i < intervals.length && intervals[i][1] < newInterval[0]){
            ans.add(new int[] {intervals[i][0] , intervals[i][1]});
            i++;
        }
        while(i < intervals.length && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0] , newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1] , newInterval[1]);
            i++;
        }
        ans.add(newInterval);

        while(i < intervals.length){
            ans.add(new int[] {intervals[i][0],intervals[i][1]});
            i++;
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
