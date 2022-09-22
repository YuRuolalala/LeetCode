package Array.Spiral_Matrix_II;

import org.junit.Test;

public class Spiral_Matrix_II_59 {
    public int[][] generateMatrix0(int n) {
        int [][]arr=new int[n][n];

        int start=0;
        int offset=1;
        int count=1;
        int loop=0;
        int i=0,j=0;
        while(loop++<n/2){

            for(j=start;j<n-offset;j++){
                arr[start][j]=count;
                count++;
            }
            for(i=start;i<n-offset;i++){
                arr[i][j]=count;
                count++;
            }
            for(;j>start;j--){
                arr[i][j]=count;
                count++;
            }
            for(;i>start;i--){
                arr[i][j]=count;
                count++;
            }
            start++;
            offset++;

        }
        if(n/2==1){
            arr[i][j]=count;
        }

        return arr;
    }

    public int[][] generateMatrix(int n) {
        int loop = 0;  // 控制循环次数
        int[][] res = new int[n][n];
        int start = 0;  // 每次循环的开始点(start, start)
        int count = 1;  // 定义填充数字
        int i, j;

        while (loop++ < n / 2) { // 判断边界后，loop从1开始
            // 模拟上侧从左到右
            for (j = start; j < n - loop; j++) {
                res[start][j] = count++;
            }

            // 模拟右侧从上到下
            for (i = start; i < n - loop; i++) {
                res[i][j] = count++;
            }

            // 模拟下侧从右到左
            for (; j >= loop; j--) {
                res[i][j] = count++;
            }

            // 模拟左侧从下到上
            for (; i >= loop; i--) {
                res[i][j] = count++;
            }
            start++;
        }

        if (n % 2 == 1) {
            res[start][start] = count;
        }

        return res;
    }

    @Test
    public void test(){

        int n=4;
        int [][] arr0=generateMatrix0(4);
        int [][] arr=generateMatrix(4);
        System.out.println(arr0[0][1]);
        System.out.println(arr[0][1]);

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}
