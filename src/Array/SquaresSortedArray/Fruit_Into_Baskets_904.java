package Array.SquaresSortedArray;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Fruit_Into_Baskets_904 {

    public static int totalFruit(int[] fruits) {

        int len=0;
        int l=0;
        Set<Integer> set=new HashSet<>();
        for(int r=0;r<fruits.length;r++){
            set.add(fruits[r]);
            if(set.size()<=2){}
            else{
                l=r-1;
                while(fruits[l]==fruits[r-1]){
                    l--;
                }
                l++;

                set.clear();
                set.add(fruits[r-1]);
                set.add(fruits[r]);
            }
            len=Math.max(len,r-l+1);
        }

        return len;
    }
    public static void main(String args[]) {
        int arr[] = new int[]{1,2,3,2,2};
        System.out.print(totalFruit(arr));
    }
}
