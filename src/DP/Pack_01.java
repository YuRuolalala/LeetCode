package DP;

public class Pack_01 {
    public static void main(String[] args) {
        int[] Weight={10,20,30,40,50};
        int[] Value={20,30,65,40,60};
        int bag=100;
        int kp=Pack01(Weight,Value,bag);
        System.out.println(kp);

    }

    private static int Pack01(int[] weight, int[] value, int bag) {
        int n=weight.length;
        int[][] dp=new int[n+1][bag+1];
        int index;
        int rest;

        for(index=n-1;index>=0;index--){//第N行的时候已经属于越界，货物下标选不了了
            for(rest=0;rest<=bag;rest++){//从左往右填DP表
                int p1=dp[index+1][rest];//不选择当前货物，查表，选择下一个货物的情况
                int p2=0;
                int next=rest-weight[index]<0?-1:dp[index+1][rest-weight[index]];
                            //选择当前货物，但是害怕当前货物超重，如果超重了，那就是-1
                            //超重那就不能选，p2=0；如果没超重，那就剩下的部分继续往后做选择
                if(next!=-1){
                    p2=value[index]+next;//同时加上当前货物的价值
                }
                dp[index][rest]=Math.max(p1,p2);
            }
        }

        return dp[0][bag];
    }
}
