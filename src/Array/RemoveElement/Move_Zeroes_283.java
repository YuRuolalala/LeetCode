package Array.RemoveElement;

public class Move_Zeroes_283 {
    public static void moveZeroes(int[] arr) {

        if(arr.length==1){
            System.out.print("["+arr[0]+"]");
            return;
        }

    int fast=0,slow=0;
    for(fast=0;fast<arr.length;fast++){
        if(arr[fast]!=0){
//            arr[slow]=arr[fast];
//            arr[fast]=0;
            int temp=arr[fast];
            arr[fast]=0;
            arr[slow]=temp;
            slow++;
        }
    }

        System.out.print("[");
        for(int i=0;i<=slow-1;i++){
            System.out.print(arr[i]+",");
        }
        for(int i=arr.length-slow;i<arr.length-1;i++){
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[arr.length-1]);
        System.out.print("]");
        return ;
    }


    public static void main(String args[]) {
        int arr[] = new int[]{1,0};
        moveZeroes(arr);

    }
}
