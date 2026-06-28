class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n = nums1.length;
        int m = nums2.length;

        int[] res = new int[n+m];
        int i = 0;

        for(int j=0;j<n;j++){
            res[i++] = nums1[j];
        }

        for(int j=0;j<m;j++){
            res[i++] = nums2[j];
        }

        Arrays.sort(res);

        int n1 = res.length;

        if(res.length % 2 == 0){
            return (double)(res[n1/2]+res[n1/2-1])/2.0;
        }
        else{
            return (double)(res[n1/2]);
        }
    }
}
