package test.retry;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class totalFruit_904 {

    /**
     *  寻找最多包含两种水果类型的最长连续子串长度
     *  i为当前遍历节点
     *  水果1为前一棵果树水果类型，水果2为采摘的另一种水果类型
     *  dp[0]表示当前水果种类最大连续长度
     *  dp[1]表示最多包含2种水果的最大连续最大长度
     *
     *  a代表水果2的种类
     *  一共分为三种情况：
     *  ①当fruit[i]与前两种水果都不相同时，即 fruit[i]!=fruit[i-1]&&fruit[i]!=a
     *  (因为要求连续，所以遇到第三种水果3，就把水果2更新为前一棵树的水果类型，
     *  水果3成为新的水果1)
     *
     *  ②当 当前果树与上一棵果树水果类型相同时，即fruit[i]==fruit[i-1]
     *  则有：
     *  dp[0]++//当前水果类型连续长度+1
     *  dp[1]++//总连续长度+1
     *
     *  ③当 当前果树水果与水果2类型相同时，即fruit[i]==a
     *  则有：
     *  a=fruit[i-1];//将前一刻果树的果子当作水果2
     *  dp[0]=1;//更新当前水果类型的连续长度
     *  dp[1]++;//总连续长度+1
     *
     *  最后返回结果max(res,dp[1]);
     * @param fruits
     * @return
     */
    public int totalFruit(int[] fruits){
        int n=fruits.length;
        int[] dp=new int[2];
        int res=0;
        int a=-1;
        dp[0]=1;dp[1]=1;
        for(int i=1;i<n;i++){
            if(fruits[i]!=fruits[i-1]&&fruits[i]!=a){
                if(dp[1]>res){
                    res=dp[1];
                }
                a=fruits[i-1];
                dp[1]=dp[0]+1;
                dp[0]=1;
            }else if(fruits[i]==fruits[i-1]){
                dp[0]++;
                dp[1]++;
            }else if(fruits[i]==a){
                a=fruits[i-1];
                dp[0]=1;
                dp[1]++;
            }
        }
        return Math.max(res,dp[1]);
    }
}
