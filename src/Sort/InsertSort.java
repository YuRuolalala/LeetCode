package Sort;

import org.junit.Test;

public class InsertSort {
    /**
     * 将第一待排序序列第一个元素看作一个有序序列
     * 把第二个元素到最后一个元素当成是未排序序列
     * 从头到尾一次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置
     * (如果待插入的元素与有序序列中的某个元素相等，
     * 则将待插入元素插入到相等元素的后面)
     * 时间复杂度O(n²)
     */

    public static void insertSort(int[] arr){
         for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
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
        insertSort(arr0);
        insertSort(arr1);
        for (int i=0;i<arr0.length;i++){
            System.out.print(arr0[i]+" ");
        }
        System.out.println();
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
