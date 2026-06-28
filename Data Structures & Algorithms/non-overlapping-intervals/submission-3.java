class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        int count = 0;
        Arrays.sort(intervals,(a,b) -> a[1] - b[1]);

        int end = intervals[0][1];

        
        for(int i =1;i<intervals.length;i++){

            int start = intervals[i][0];

            if(start >= end){
                end = intervals[i][1];
            }
            else{
                count++;
                end = Math.min(end,intervals[i][1]);
            }
        }
        return count;
    }
}
