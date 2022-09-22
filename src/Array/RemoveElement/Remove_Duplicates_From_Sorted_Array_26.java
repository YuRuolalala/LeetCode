package Array.RemoveElement;

public class Remove_Duplicates_From_Sorted_Array_26 {

    public static int removeDuplicates(int[] arr) {
        int count=0;
        int fast=0,slow=0;
        for(fast=0;fast<arr.length;fast++){

            if(arr[fast]!=arr[slow]){
                slow++;
                count++;
                arr[slow]=arr[fast];
            }
        }
//        for(int i=0;i<arr.length;i++){
//           System.out.print(arr[i]+" ");
//        }

        return count+1;
    }

    public static void main(String args[]) {
        int arr[] = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.print(removeDuplicates(arr));

    }
}
