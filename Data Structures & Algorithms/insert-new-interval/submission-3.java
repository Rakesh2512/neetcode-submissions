class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int n = intervals.length;
        List<int[]>ans = new ArrayList<>();


        int i = 0;

        // if there is no overlap
        while(i<n && intervals[i][1] < newInterval[0]){
            ans.add(new int[]{intervals[i][0],intervals[i][1]});
            i++;
        }

        // if there is overlap between intervals,and newInterval

        while(i < n && intervals[i][0] <= newInterval[1]){

            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;
        }

        ans.add(newInterval);

        // if remaining intervals need to add
        while(i<n){
            ans.add(new int[] {intervals[i][0],intervals[i][1]});
            i++;
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
