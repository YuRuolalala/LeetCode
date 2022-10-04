package Sort;

import org.junit.Test;

public class ShellSort {
    /**
     * 基本思想：先将震哥哥待排序的记录序列分割成为若干子序列分别进行直接插入排序
     * 待整个序列中的记录“基本有序”时，再对全体记录进行依次直接插入排序
     * 步骤：
     * 选择一个增量序列t1,t2,......,tk,其中ti>tj,tk=1;
     * 按增量序列个数k，对序列进行k趟排序;
     * 每趟排序，根据对应的增量ti，将待排序列分割成若干个长度为m的子序列，分别对各子序列进行直接插入排序。
     * 仅增量音子为1时，整个序列作为一个表处理，表长度即为整个序列的长度
     *
     * 人话版本：
     *     ①：先分组 先找总长度的一半左右的间隔分组
     *           即  0 1 2 3 4 5 6 7 8 数组下标，按照下标分组  间隔取 4
     *              0-4-8  1-5  2-6  3-7
     *     ②：组内排序
     *          0-4-8 三个元素之间按要求排，不满足就互换位置    1-5 两个元素之间按要求排。。同理
     *     ③：再次取间隔，再分组，这回的间隔为上一回的间隔长度的一半
     *           即  0 1 2 3 4 5 6 7 8
     *              0-2-4-6-8  1-3-5-7
     *     ④：组内排序
     *     ......
     *     最后两步：再次取间隔，再分组，直到间隔长度为 1
     *              即 所有的元素都成为了同一组
     *     最后一步：把最后这个间隔为1的排序
     *     (上述所有组内排序都用插入排序)
     */

    public static void shellSort(int[] arr){
        int i,j,key,inc;
        int n=arr.length;
        for(inc=n/2;inc>0;inc=inc/2){
            //每一趟采用插入排序
            for(i=inc;i<n;i++){
                key=arr[i];
                for(j=i;j>=inc&&key<arr[j-inc];j=j-inc){
                    arr[j]=arr[j-inc];
                }
                arr[j]=key;
            }
        }
    }

    @Test
    public void test(){
        int[] arr0={6,2,5,1,0,3,4};
        int[] arr1={8,4,7,1,0,3,8,4,6,9,11,36,8,4,9};
        shellSort(arr0);
        shellSort(arr1);
        for (int i=0;i<arr0.length;i++){
            System.out.print(arr0[i]+" ");
        }
        System.out.println();
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
