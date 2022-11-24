package test.retry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class hr03 {
    public static List<String> logInAndLogOut(ArrayList<String> logs, int maxSpan){
        ArrayList result=new ArrayList();
        ArrayList ans=new ArrayList();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<logs.size();i++){
            StringBuilder sbnum=new StringBuilder();
            StringBuilder sbtime=new StringBuilder();
            int space1=0;
            while (logs.get(i).charAt(space1)!=' '){
                space1++;
            }
            for(int j=0;j<space1;j++){
                sbnum.append(logs.get(i).charAt(j));
            }
            int space2=++space1;
            while (logs.get(i).charAt(space2)!=' '){
                space2++;
            }
            for(int j=space1;j<space2;j++){
                sbtime.append(logs.get(i).charAt(j));
            }
            Integer num=Integer.parseInt(new String(sbnum));
            Integer time=Integer.parseInt(new String(sbtime));
            if(map.containsKey(num)){
                if(time-map.get(num)<=maxSpan){
                    result.add(num);
                }
            }
            map.put(num,time);
        }
        int[] arr=new int[result.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]= (int) result.get(i);
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            String temp=String.valueOf(arr[i]);
            ans.add(temp);
        }
        return ans;
    }


    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        int key=20;
        arrayList.add("30 99 sign-in");
        arrayList.add("30 105 sign-out");
        arrayList.add("12 100 sign-in");
        arrayList.add("20 80 sign-in");
        arrayList.add("12 120 sign-out");
        arrayList.add("20 101 sign-out");
        arrayList.add("21 110 sign-in");
        System.out.println(logInAndLogOut(arrayList,key));
    }
}
