package Array.BinarySearch;

import java.util.WeakHashMap;

public class Find_First_and_Last_Position_in_Sorted_Array_34 {

    public static int[] searchRange(int[] arr, int key) {

        int result[]=new int[]{-1,-1};
        int index=TestforBinary(arr,key);
        if(index==-1){
            return result;
        }
        int L=index,R=index;
        while(L-1>=0&&arr[L-1]==key){
            L=L-1;
        }
        while(R+1<arr.length&&arr[R+1]==key){
            R=R+1;
        }
        result= new int[]{L , R };


        return result;
    }

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

    public static void main(String args[]){
        int arr[]=new int[]{5,7,7,8,8,10,11};
        int result[]=searchRange(arr,8);
        System.out.print(result[0]);
        System.out.print(result[1]);
    }
}
