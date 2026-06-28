class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int TotalGas = 0;
        int TotalCost = 0;

        for(int it : gas){
            TotalGas+=it;
        }

        for(int it : cost){
            TotalCost+=it;
        }

        if(TotalGas < TotalCost){
            return -1;
        }

        int start  =0;
        int currGas = 0;

        for(int i=0;i<gas.length;i++){
            currGas+= (gas[i] - cost[i]);

            if(currGas < 0){
                currGas = 0;
                start  =i+1;
            }
        }
        return start;
    }
}
