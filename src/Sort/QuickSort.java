package Sort;

public class QuickSort {
    public static void QuickSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        process(arr,0,arr.length-1);
    }

    private static void process(int[] arr, int L, int R) {
        if(L>=R){
            return;
        }
        int M=qusort(arr,L,R);
        process(arr,L,M-1);
        process(arr,M+1,R);
    }

    private static int qusort(int[] arr, int L, int R) {
        int l=L-1;
        int r=R;
        int m=L;
        while (m<r){
            if(arr[m]>=arr[m+1]){
                swap(arr,m,m+1);
                m++;l++;
            }else {
                swap(arr,m+1,r);
                r--;
            }
        }
        return m;
    }

    private static void swap(int[] arr, int x, int y) {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
