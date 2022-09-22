package Array.SquaresSortedArray;

public class Minimum_Size_Subarray_Sum_209 {

    public static int minSubArrayLen(int key, int[] arr) {

        int result=10000000;
        int sum=0;
        int i=0;
        int subLength=0;
        for(int j=0;j<arr.length;j++){
            sum=sum+arr[j];

            while(sum>=key){
                subLength=j-i+1;
                result=result<subLength?result:subLength;
                sum=sum-arr[i];
                i++;
            }
        }
        if(result==10000000){
            return 0;
        }else{
            return result;
        }
    }
    public static void main(String args[]) {
        int arr[] = new int[]{1,1,1,1,1,1,1,1};
        System.out.print(minSubArrayLen(11,arr));
    }
}
