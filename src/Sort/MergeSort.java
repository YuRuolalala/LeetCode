package Sort;

import org.junit.Test;

public class MergeSort {
    /**先划分，再合并
     * 划分步骤：
     * 1·拿到一个数组，取到最左边下标 L，和最右边下标 R，求得中间下标 M
     * 2·把它划分成两个数组 左组范围是 L~M 右组范围是 M+1~R
     * 重复1~2步骤不断划分，直到得到每组都是只有一个元素的数组
     *
     *
     * merge步骤：
     * 1·申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列
     * 2·设定两个指针，最初位置分别为两个已经排序序列的起始位置
     * 3·比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置
     * 4·重复步骤 3 知道某一指针达到序列尾
     * 5·将零一序列剩下的所有元素直接复制到合并序列尾
     */

    public static void mergeSrot(int[] arr) {
        if(arr==null||arr.length<2){
            return;
        }else {
            process(arr,0,arr.length-1);
        }
    }
    public static void process(int[] arr,int L,int R){
        if(L==R){
            return;
        }
        int M=L+((R-L)>>1);
        process(arr,L,M);
        process(arr,M+1,R);
        merge(arr,L,M,R);
    }
    public static void merge(int[] arr,int L,int M,int R){
        int[] temp=new int[R-L+1];
        int p1=L;
        int p2=M+1;
        int i=0;
        while(p1<=M&&p2<=R){
            temp[i++]=arr[p1]<=arr[p2]?arr[p1++]:arr[p2++];
        }
        //出现有一组已经用完了，那么把剩余的另外一组填满临时数组
        while (p1<=M){
            temp[i++]=arr[p1++];
        }
        while (p2<=R){
            temp[i++]=arr[p2++];
        }
        for(i=0;i<temp.length;i++){
            arr[L+i]=temp[i];
        }
    }


    @Test
    public void test(){
        int[] arr0={6,2,5,1,0,3,4};
        int[] arr1={8,4,7,1,0,3,8,4,6,9,11,36,8,4,9};
        mergeSrot(arr0);
        mergeSrot(arr1);
        for (int i=0;i<arr0.length;i++){
            System.out.print(arr0[i]+" ");
        }
        System.out.println();
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }

}
