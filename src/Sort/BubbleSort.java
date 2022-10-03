package Sort;

import org.junit.Test;

public class BubbleSort {
    /**
     *  比较相邻的元素。如果第一个比第二个大，就交换他们两个
     *  对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。
     *  上一步操作做完后，最后的元素会是最大的数
     *  针对所有的元素重复以上的步骤，除了最后一个
     *
     *  持续每次对越来越少的元素重复上述的步骤，直到没有任何一对数字需要进行比较
     */
    /**
     * 何时最快？输入数据已经是正序的时候
     * 何时最慢？输入的数据是反序的时候
     * 时间复杂度 O(n²)
     */

    public static void bubbleSort(int[] arr){

        for(int i=0;i<arr.length-1;i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
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
        int[] arr={8,4,7,1,0,3,8,4,6,9,11,36,8,4,9};
        bubbleSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
