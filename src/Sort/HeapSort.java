package Sort;

import org.junit.Test;

public class HeapSort {
    /**
     *  堆排序：
     *  大顶堆：每个节点的值都大于或等于其子节点的值，在堆排序算法中用于升序排列；
     *  小顶堆：每个节点的值都小于或等于其子节点的值，在堆排序算法中用于降序排列。
     *  堆排序的平均时间复杂度是O（nlogn）
     *
     *  算法步骤：
     *  1·创建一个堆H[0...n-1]；
     *  2·把堆首(最大值)和堆尾互换；
     *  3·把堆的尺寸缩小1，并调用shift_down(0),目的是把新的数组顶端数据调整到相应位置；
     *  4·重复步骤2，直到堆的尺寸为1
     *
     *  下标为i的节点的父节点下标：(i-1)/2 【向下取整】
     *  下标为i的节点的左孩子下标：i*2+1
     *  下标为i的节点的右孩子下标：i*2+2
     *
     *  维护堆的性质，以大顶堆为例
     */

    static void heapify(int[] arr, int i, int len) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < len && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < len && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, len);
        }
    }
    public static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    static void heap_sort(int[] arr){
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }
        for(int i=n-1;i>0;i--){
            swap(arr,0,i);
            n--;
            heapify(arr,0,n);
        }

    }

    @Test
    public void test(){
        int[] arr0={2,1,0,3,4};
        int[] arr1={8,4,7,1,0,3,8,4,6,9,11,36,8,4,9};
        heap_sort(arr0);
        heap_sort(arr1);
        for (int i=0;i<arr0.length;i++){
            System.out.print(arr0[i]+" ");
        }
        System.out.println();
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
