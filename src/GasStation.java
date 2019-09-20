public class GasStation {

    /*

     */
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0;
        int rest=0;
        int run=0;
        int maxCost=0;
        for(int i=0;i<gas.length;i++){
            rest+=gas[i]-cost[i];
            run+=gas[i]-cost[i];
            if(run<maxCost){   //只需比较连续行进时的最大gas消耗量（负的），如果一次遍历剩余的rest大于这个最大消耗量的绝对值，则能跑完一圈
                maxCost=run;
            }
            if(rest<0){     //一定从加油>消耗的地方开始作为起点
                start=i+1;
                rest=0;
            }
        }
        if(rest+maxCost<0){
            return -1;
        }else{
            return start;
        }
    }

    public static void main(String args[]){
        int [] gas={1,2,3,4,3,2,4,1,5,3,2,4};
        int [] cost={1,1,1,3,2,4,3,6,7,4,3,1};
        System.out.println(canCompleteCircuit(gas,cost));
    }
}
