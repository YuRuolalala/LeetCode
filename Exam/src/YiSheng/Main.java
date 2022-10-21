package YiSheng;

public class Main {

    public int combinationSum (int[] candidates, int target) {
        // write code here
        int count=0;
        sort(candidates);
        int n=candidates.length;
        for(int i=0;i<n;i++){
            int sum=0;

        }



        return count;
    }

    public static void sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    public static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
