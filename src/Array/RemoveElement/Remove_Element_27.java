package Array.RemoveElement;

public class Remove_Element_27 {

    public static int removeElement(int[] arr, int key) {
        int count=0;
        int fast=0,slow=0;
        for(fast=0;fast<arr.length;fast++){
            arr[slow]=arr[fast];
            if(arr[fast]!=key){
                slow++;count++;
            }

        }
//
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

        return count;
    }

    public static void main(String args[]) {
        int arr[] = new int[]{0,1,2,2,3,0,4,2};
        System.out.print(removeElement(arr,2));

    }
}
