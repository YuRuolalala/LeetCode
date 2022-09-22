package Array.BinarySearch;

import org.junit.Test;

public class Binary_Search_704 {

    public static int TestforBinary(int[] arr, int key){
     int L=0,R=arr.length-1;
     while (L<=R){
         int M=L+((R-L)>>1);
         if(arr[M]>key){
             R=M-1;
         }else if(arr[M]<key){
             L=M+1;
         }else{
             return M;
         }
     }
     return -1;
    }

    public static void main(String args[]) {

        int[] arr=new int[]{-1,0,3,5,9,12};
        int key=9;
        int key1=10;

        System.out.print(TestforBinary(arr, key));
        System.out.print(TestforBinary(arr,key1));
    }

}
