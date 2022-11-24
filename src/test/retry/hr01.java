package test.retry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class hr01 {
    public static int stockPairs(List<Integer> stocksProfit, long target) {
        int result=0;

//        long[] arr=new long[stocksProfit.size()];
        boolean[] used=new boolean[stocksProfit.size()];
        for(int i=0;i<stocksProfit.size();i++){
            used[i]=false;
        }
        HashMap map=new HashMap<>();
        for(int i=0;i<stocksProfit.size();i++){
            Integer temp=(int)target-stocksProfit.get(i);
            if(map.containsKey(temp)&&used[(int) map.get(temp)]==false&&used[i]==false){
                result++;
                used[i]=true;
                used[(int) map.get(temp)]=true;
            }
            map.put(stocksProfit.get(i), i);

        }

        return result;
    }

    public static void main(String[] args) {
        hr01 hr01 = new hr01();
        ArrayList list=new ArrayList();
        long k=12;
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(13);
        list.add(11);
        list.add(6);
        list.add(6);
        list.add(3);
        list.add(3);
        System.out.println(stockPairs(list,k));
    }
}
