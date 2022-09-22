package Array.SquaresSortedArray;

public class Squares_of_a_Sorted_Array_977 {

    public static  int[] sortedSquares(int[] nums) {
        int [] arr=new int[nums.length];
        int i=0;
        int j= nums.length-1;
        int k=nums.length-1;
        while(i!=j){
            if(nums[i]*nums[i]>=nums[j]*nums[j]){
                arr[k]=nums[i]*nums[i];
                k--;
                i++;
            }else{
                arr[k]=nums[j]*nums[j];
                k--;
                j--;
            }
        }
        arr[0]=nums[i]*nums[i];
//        for(i=0;i<arr.length;i++){
//            System.out.print(" "+arr[i]);
//        }
        return arr;
    }
    public static void main(String args[]) {
        int arr[] = new int[]{-4,-1,0,3,10};
        sortedSquares(arr);

    }
}
