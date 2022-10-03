package Sort;

import org.junit.Test;

public class SelectSort {
    /**
     * 首先在未排序序列中找到最小元素，存放到排序序列的起始位置
     * 再从剩余未排序的元素中找到最小元素，然后放到已排序序列的末尾
     * 重复第二步，直到所有元素均排序完毕
     * 时间复杂度，O(n²) 好处是不占用额外的内存空间
     */

    public static void selectSort(int[] arr){
        int min=Integer.MAX_VALUE;
        int count=0;
        int k=0;
        for(int i=0;i<arr.length;i++){
            min=Integer.MAX_VALUE;
            for(int j=count;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    k=j;
                }
            }
            swap(arr,count,k);
            count++;
        }
    }

    public static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    @Test
    public void test(){
        int[] arr0={2,1,0,3,4};
        int[] arr1={8,4,7,1,0,3,8,4,6,9,11,36,8,4,9};
        selectSort(arr0);
        selectSort(arr1);
        for (int i=0;i<arr0.length;i++){
            System.out.print(arr0[i]+" ");
        }
        System.out.println();
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
